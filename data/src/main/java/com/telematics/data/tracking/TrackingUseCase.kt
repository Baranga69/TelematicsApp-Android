package com.telematics.data.tracking

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import com.telematics.data.utils.ImageLoader
import com.telematics.domain.model.tracking.ChangeTripEvent
import com.telematics.domain.model.tracking.TripData
import com.telematics.domain.model.tracking.TripDetailsData
import com.telematics.domain.repository.TrackingApiRepo
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class TrackingUseCase
@Inject constructor(
    context: Context,
    private val trackingApiRepo: TrackingApiRepo,
    private val imageLoader: ImageLoader
) {

    init {
        trackingApiRepo.setContext(context)
    }

    fun setDeviceToken(deviceToken: String) {

        if (deviceToken.isNotBlank())
            trackingApiRepo.setDeviceToken(deviceToken)
    }

    fun checkPermissions(): Flow<Boolean> {
        return trackingApiRepo.checkPermissions()
    }

    fun startWizard(activity: Activity) {
        trackingApiRepo.checkPermissionAndStartWizard(activity)
    }

    fun enableTrackingSDK() {
        trackingApiRepo.setEnableTrackingSDK(true)
    }

    fun disableTrackingSDK() {
        trackingApiRepo.setEnableTrackingSDK(false)
    }

    fun setIntentForNotification(intent: Intent) {

        trackingApiRepo.setIntentForNotification(intent)
    }

    fun logout() {
        trackingApiRepo.logout()
    }


    fun getLastTrip(): Flow<TripData?> {

        return flow {
            val data = trackingApiRepo.getLastTrack()
            emit(data)
        }
    }

    fun getTripImage(token: String): Flow<Bitmap?> {

        return flow {
            val data = trackingApiRepo.getTrackImageHolder(token) ?: return@flow emit(null)
            val bitmap = imageLoader.loadImage(data.url, data.r, token)
            emit(bitmap)
        }
    }

    fun getTrips(offset: Int, limit: Int): Flow<List<TripData>> {

        return flow {
            val data = trackingApiRepo.getTrips(offset, limit)
            emit(data)
        }
    }

    fun getTripDetailsByPos(position: Int): Flow<TripDetailsData?> {
        return flow {
            val tripData = trackingApiRepo.getTrips(position, 1).firstOrNull()
            tripData?.id?.let { tripId ->
                val data = trackingApiRepo.getTripDetails(tripId)
                emit(data)
            } ?: run {
                emit(null)
            }
        }
    }

    fun changeTripType(tripId: String, toTripType: TripData.TripType): Flow<Boolean> {

        return flow {
            val data = trackingApiRepo.changeTripType(tripId, toTripType)
            emit(data)
        }
    }

    fun changeTripEvent(tripId: String, changeTripEvent: ChangeTripEvent): Flow<Boolean> {

        return flow {
            val data = trackingApiRepo.changeTripEvent(tripId, changeTripEvent)
            emit(data)
        }
    }
}
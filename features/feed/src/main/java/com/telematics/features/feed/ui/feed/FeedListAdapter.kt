package com.telematics.features.feed.ui.feed

import android.animation.ValueAnimator
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.telematics.data.extentions.color
import com.telematics.data.extentions.drawable
import com.telematics.data.extentions.format
import com.telematics.data.model.tracking.DateFormatter
import com.telematics.domain.model.tracking.TripData
import com.telematics.feed.R
import kotlinx.android.synthetic.main.layout_trip_item.view.*
import kotlin.math.roundToInt


class FeedListAdapter(
    private val formatter: DateFormatter
) :
    RecyclerView.Adapter<FeedListAdapter.ViewHolder>() {

    private var dataSet: MutableList<TripData> = mutableListOf()
    private var lastPosition = -1
    private val animationList = mutableListOf<ValueAnimator>()

    fun addData(data: List<TripData>) {

        animationList.forEach {
            it.duration = 1
        }

        dataSet.addAll(data)
        notifyDataSetChanged()
    }

    fun addData(data: TripData) {

        dataSet.add(data)
        notifyDataSetChanged()
    }

    fun clearAllData() {

        lastPosition = -1
        dataSet.clear()
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_trip_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(dataSet[position])
        setAnimation(holder.itemView, position)
    }

    override fun getItemCount(): Int = dataSet.size

    private fun setAnimation(view: View, position: Int) {

        val firstFixCount = 6

        if (position > lastPosition && position > firstFixCount) {
            val animation = ValueAnimator.ofFloat(500f, 0f)
            animation.duration = 300
            animation.addUpdateListener {
                val v = it.animatedValue as Float
                view.translationX = v
            }
            animation.start()

            animationList.add(animation)
            lastPosition = position
        }
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bind(tripItem: TripData) {

            val context = itemView.context

            itemView.eventTripMileage.text = tripItem.dist.format()
            itemView.measure_dist_text.text = context.getString(R.string.dashboard_new_km)
            val startDate = formatter.parseFullNewDate(tripItem.timeStart!!)
            val endDate = formatter.parseFullNewDate(tripItem.timeEnd!!)
            itemView.eventTripDateStart.text = formatter.getDateWithTime(startDate)
            itemView.eventTripDateFinish.text = formatter.getDateWithTime(endDate)
            itemView.eventTripStartCity.text =
                "|  ".plus(tripItem.cityStart + ", " + tripItem.districtStart) // "125, 5th Really long name Avenue, Pittsburgh, PA"
            itemView.eventTripEndCity.text =
                "|  ".plus(tripItem.cityEnd + ", " + tripItem.districtEnd) // "47 Cherry Hill Highway, New York, NY"
            itemView.eventTripOverallScore.text = tripItem.rating.roundToInt().toString()

            itemView.eventTripOverallScore.setTextColor(
                when (tripItem.rating.roundToInt()) {
                    in 0..40 -> context.resources.color(R.color.colorRedText)
                    in 41..60 -> context.resources.color(R.color.colorOrangeText)
                    in 61..80 -> context.resources.color(R.color.colorYellowText)
                    in 80..100 -> context.resources.color(R.color.colorGreenText)
                    else -> context.resources.color(R.color.colorGreenText)
                }
            )

            itemView.eventTripDetailsClickArea.setOnClickListener {
                //clickListener.invoke(tripItem, this.adapterPosition, SHOW_TRIP_DETAILS)
            }

            itemView.item_event_type_layout.setOnClickListener { }

            // check radio btn
            val updateViews = {
                when (tripItem.type) {
                    TripData.TripType.DRIVER -> {
                        itemView.item_event_type_name.text =
                            context.getString(R.string.progress_trip_type_driver)
                        itemView.item_event_type_img.setImageResource(R.drawable.ic_event_trip_bubble_driver)
                    }
                    TripData.TripType.PASSENGER -> {
                        itemView.item_event_type_name.text =
                            context.getString(R.string.progress_trip_type_passenger)
                        itemView.item_event_type_img.setImageResource(R.drawable.ic_event_trip_bubble_passenger)
                    }
                    TripData.TripType.BUS -> {
                        itemView.item_event_type_name.text =
                            context.getString(R.string.progress_trip_type_bus)
                        itemView.item_event_type_img.setImageResource(R.drawable.ic_event_trip_bubble_bus)
                    }
                    TripData.TripType.MOTORCYCLE -> {
                        itemView.item_event_type_name.text =
                            context.getString(R.string.progress_trip_type_motorcycle)
                        itemView.item_event_type_img.setImageResource(R.drawable.ic_event_trip_bubble_motorcycle)
                    }
                    TripData.TripType.TRAIN -> {
                        itemView.item_event_type_name.text =
                            context.getString(R.string.progress_trip_type_train)
                        itemView.item_event_type_img.setImageResource(R.drawable.ic_event_trip_bubble_train)
                    }
                    TripData.TripType.TAXI -> {
                        itemView.item_event_type_name.text =
                            context.getString(R.string.progress_trip_type_taxi)
                        itemView.item_event_type_img.setImageResource(R.drawable.ic_event_trip_bubble_taxi)
                    }
                    TripData.TripType.BICYCLE -> {
                        itemView.item_event_type_name.text =
                            context.getString(R.string.progress_trip_type_bicycle)
                        itemView.item_event_type_img.setImageResource(R.drawable.ic_event_trip_bubble_bicycle)
                    }
                    TripData.TripType.OTHER -> {
                        itemView.item_event_type_name.text =
                            context.getString(R.string.progress_trip_type_other)
                        itemView.item_event_type_img.setImageResource(R.drawable.ic_event_trip_bubble_other)
                    }
                    else -> {
                        itemView.item_event_type_name.text =
                            context.getString(R.string.progress_trip_type_other)
                        itemView.item_event_type_img.setImageResource(R.drawable.ic_event_trip_bubble_other)
                    }
                }
            }

            updateViews()

            itemView.item_event_type_layout.setOnClickListener {

            }

            itemView.eventTripLabel.text =
                itemView.resources.getString(R.string.progress_event_trip)
            itemView.eventTripLabel.background = itemView.resources.drawable(
                R.drawable.ic_event_trip_label_bg_green,
                itemView.context
            )
        }
    }

    companion object {
        const val CONFIRM_HIDE_TRACK = "confirm_hide_track"
        const val CONFIRM_SHARE_TRACK = "confirm_share_track"
        const val CHANGE_TRIP_ORIGIN_TYPE = "change_trip_origin_type"
        const val SHOW_TRIP_DETAILS = "show_trip_details"
    }
}
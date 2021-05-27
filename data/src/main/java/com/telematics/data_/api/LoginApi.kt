package com.telematics.data_.api

import com.telematics.data_.model.login.LoginBody
import com.telematics.data_.model.login.LoginWithDeviceTokenBody
import com.telematics.data_.model.login.RegistrationBody
import com.telematics.data_.model.rest.ApiResponse
import com.telematics.data_.model.rest.ApiResult
import com.telematics.data_.model.user_exists.UserExists
import io.reactivex.Single
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface LoginApi {

    @GET("v1/Check/UserExists")
    suspend fun checkUserExists(
        @Query("Phone") phone: String? = null,
        @Query("Email") email: String? = null,
        @Query("ClientId") clientId: String? = null
    ): Single<ApiResponse<UserExists>>

    @POST("v1/Auth/Login")
    suspend fun login(@Body loginBody: LoginBody): ApiResponse<ApiResult>

    @POST("v1/Registration/create")
    suspend fun registrationWithEmail(
        @Body registrationBody: RegistrationBody
    ): ApiResponse<ApiResult>

    @POST("v1/Auth/Login")
    suspend fun loginWithDeviceToken(@Body loginBodyWithDeviceToken: LoginWithDeviceTokenBody): ApiResponse<ApiResult>
}
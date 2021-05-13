package com.telematics.data_.model.login

import com.google.gson.annotations.SerializedName

data class LoginBody(
    @SerializedName("loginFields")
    val loginFields: LoginFields,
    @SerializedName("password")
    val password: String
)
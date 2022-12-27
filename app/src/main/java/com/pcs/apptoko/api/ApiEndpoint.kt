package com.pcs.apptoko.api

import com.pcs.apptoko.response.login.LoginResponse
import com.pcs.apptoko.response.produk.ProdukResponse
import retrofit2.Call
import retrofit2.http.*

interface ApiEndpoint {
    @FormUrlEncoded
    @POST("login")
    fun login(
        @Field("email") email : String,
        @Field("password") password : String
    ) : Call<LoginResponse>

    @GET("produk")
    fun getProduk(@Header("Authorization")token : String) : Call<ProdukResponse>
    @FormUrlEncoded
    @POST("produk")
    fun postProduk(
        @Header("Authorization") token : String
    )
}
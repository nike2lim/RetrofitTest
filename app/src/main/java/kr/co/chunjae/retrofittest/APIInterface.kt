package kr.co.chunjae.retrofittest

import retrofit2.http.GET
import retrofit2.Call
import kr.co.chunjae.retrofittest.MultipleResource

interface APIInterface {

    @GET("api/unknown")
    fun  doGetListResources() : Call<MultipleResource>
}
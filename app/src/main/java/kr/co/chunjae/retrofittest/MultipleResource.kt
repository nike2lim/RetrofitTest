package kr.co.chunjae.retrofittest

import com.google.gson.annotations.SerializedName

class MultipleResource {

    @SerializedName("page")
    var page : Int = 0

    @SerializedName("per_page")
    var perPage : Int = 0

    @SerializedName("total")
    var total : Int = 0

    @SerializedName("total_pages")
    var totalPages : Int = 0

    @SerializedName("data")
    lateinit var data : ArrayList<Datum>

    class Datum {
        @SerializedName("id")
        var id : Int = 0

        @SerializedName("name")
        var name : String = ""

        @SerializedName("year")
        var year : Int = 0

        @SerializedName("pantone_value")
        var pantoneValue = ""
    }

}
package kr.co.chunjae.retrofittest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {
    val TAG = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val client  = APIClient.getClient()
        val call = client.create(APIInterface::class.java).doGetListResources()
        call.enqueue(object : Callback<MultipleResource> {
            override fun onFailure(call: Call<MultipleResource>, t: Throwable) {
                Log.d(TAG,  "call failed : ${t.message}")
            }

            override fun onResponse(call: Call<MultipleResource>, response: Response<MultipleResource>) {
                Log.d(TAG, "call response : ${response}")
            }

        })


    }
}

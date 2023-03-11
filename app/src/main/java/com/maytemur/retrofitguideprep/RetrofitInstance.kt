package com.maytemur.retrofitguideprep

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitInstance { //Object yaptık çünkü singleton
    //now we are crating api
    val api:ToDoApi by lazy {
        //it won't be initialized right away ,it will when first acces for this api
        Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ToDoApi::class.java)
    }
}
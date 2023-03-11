package com.maytemur.retrofitguideprep

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface ToDoApi {
    //4 tip request var-> 1-get 2-post 3-put(database update için) 4-delete(database veri silmek için)
    //biz burda basitçe data alıyoruz web page'den bu yüzden get
    @GET("/todos")
    suspend fun getTodos(): Response<List<ToDo>>
    //json verileri [] lar içinde yani liste içinde web de ve coroutine asenkron için suspend eklendi

    //fun getTodos(@Query("key") key: String): Response<List<ToDo>> gibi farklı kullanımları var
    // json verileri [] lar içinde yani liste içinde web de

    /*
    @POST("/createTodo")
    fun createTodo(@Body toDo: ToDo): Response<CreateTodoResponse> */
}
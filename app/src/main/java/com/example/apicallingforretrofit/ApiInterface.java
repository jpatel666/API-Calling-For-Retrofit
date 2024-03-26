package com.example.apicallingforretrofit;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

public interface ApiInterface {


    //GET API Calling Using Retrofit Library

    //URL:-https://jsonplaceholder.typicode.com/posts/1
    //Base URL:-https://jsonplaceholder.typicode.com/
    //Sub URL:-posts/1
    //Method Type:-GET
    @GET("posts/1")
    Call<User> getUser();


    //GET API Calling Using Retrofit Library With Parameters

    //URL:-https://dummyjson.com/products/search
    //Base URL:-https://dummyjson.com/
    //Sub URL:-products/search
    //Parameters Key:-q
    //Parameters Value:-Laptop
    //Method Type:-GET

    @GET("products/search")
    Call<Product> getProduct(@QueryMap Map<String, String> map);


    //POST API Calling Using Retrofit Library With Parameters

    //URL:-https://reqres.in/api/unknown
    //Base URL:-https://reqres.in/api/
    //Sub URL:-unknown
    //Parameters Key:-page, year
    //Parameters Value:-1, 2000
    //Method Type:-POST
    @FormUrlEncoded  //@FormUrlEncoded Only POST Method
    @POST("unknown")
    Call<Unknown> getUnknown(@Field("page") String page, @Field("year") String year);

}

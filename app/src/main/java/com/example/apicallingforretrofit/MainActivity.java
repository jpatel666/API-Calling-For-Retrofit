package com.example.apicallingforretrofit;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    //API Calling For Retrofit Library

    //Step 1 : Add Retrofit Dependency
    //Step 2 : Create Class For ApiClient
    //Step 3 : Create Interface For ApiInterface
    //Step 4 : Add GsonConverterFactory Dependency
    //Step 5 : Create API Converter Class...[jsonschema2pojo]...(Package:-Live Project Package Name)...(Class Name:-Class Name As Your Wish)...(JSON, Gson, Use primitive types, Make classes serializable)]


    //Retrofit In API Always Start Is Object{} But Never Not Start Is Array
    //Retrofit API Response Check...[Postman API Platform...(Workspace>>>My Workspace>>>New>>>HTTP)]


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getAllPost();
        getAllProduct();
        getAllUnknown();

    }


    void getAllPost() {   //GET API Calling Using Retrofit Library
        ApiClient apiClient = new ApiClient();

        apiClient.getApiClient("https://jsonplaceholder.typicode.com/").getUser().enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {

                User user = response.body();
                Log.e("fecervtertv", "" + user);
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Log.e("erdudfbuef", "" + t);
            }
        });
    }


    void getAllProduct() {  //GET API Calling Using Retrofit Library With Parameters

        ApiClient apiClient = new ApiClient();

        String Lap = "Laptop";
        //String Fre = "Freckle";

        HashMap hashMap = new HashMap();

        hashMap.put("q", Lap);
        //hashMap.put("q", Fre);

        apiClient.getApiClient("https://dummyjson.com/").getProduct(hashMap).enqueue(new Callback<Product>() {
            @Override
            public void onResponse(Call<Product> call, Response<Product> response) {

                Product product = response.body();
                Log.e("hsbdyeyfe", "" + product);
            }

            @Override
            public void onFailure(Call<Product> call, Throwable t) {
                Log.e("egegetewerte", "" + t);
            }
        });
    }

    void getAllUnknown() {  //POST API Calling Using Retrofit Library With Parameters

        String Page = "1";
        String Year = "2000";

        new ApiClient().getApiClient("https://dummy.restapiexample.com/api/v1/").getUnknown(Page, "2000").enqueue(new Callback<Unknown>() {
            @Override
            public void onResponse(Call<Unknown> call, Response<Unknown> response) {

                Unknown unknown = response.body();
                Log.e("hsbjhwsidhiw", "" + unknown);
            }

            @Override
            public void onFailure(Call<Unknown> call, Throwable t) {

                Log.e("acssfcws", "" + t);
            }
        });
    }


}
package com.nishantnimbare.test;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static Retrofit retrofit;

    private static final String BASE_URL="https://andruxnet-random-famous-quotes.p.mashape.com";

    public static Retrofit getinstance(){
        if (retrofit==null){
            retrofit=new Retrofit.Builder()
                          .baseUrl(BASE_URL)
                          .addConverterFactory(GsonConverterFactory.create())
                          .build();
        }
        return retrofit;
    }
}

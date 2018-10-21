package com.nishantnimbare.test;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface RetrofitInterface {

@Headers({"X-Mashape-Key: VnYQAf8KwdmshsVIDX178lG5YTVWp1xgALujsnJgKT3ZOq2mm1", "Accept: application/json"})
@GET("/")
    Call<Quote[]> getQuotes(@Query("count") int count);
}

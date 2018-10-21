package com.nishantnimbare.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.security.auth.login.LoginException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RetrofitInterface service = RetrofitClient.getinstance().create(RetrofitInterface.class);

        Call<Quote[]> call= service.getQuotes(5);

        call.enqueue(new Callback<Quote[]>() {
            @Override
            public void onResponse(Call<Quote[]> call, Response<Quote[]> response) {
                Quote[] quotes = response.body();
                Log.e(TAG, "onResponse: Passed"+quotes);
            }

            @Override
            public void onFailure(Call<Quote[]> call, Throwable t) {
                Log.e(TAG, "onFailure: Failed");
            }
        });
    }
}

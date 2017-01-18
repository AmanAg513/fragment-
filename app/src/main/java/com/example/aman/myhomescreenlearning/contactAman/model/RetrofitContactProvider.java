package com.example.aman.myhomescreenlearning.contactAman.model;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import com.example.aman.myhomescreenlearning.helper.Urls;

/**
 * Created by aman on 18/1/17.
 */
public class RetrofitContactProvider implements ContactProvider {

    public RetrofitContactUsProvider() {

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor)
//                .addInterceptor(REWRITE_CACHE_CONTROL_INTERCEPTOR).cache(RetrofitCache.provideCache()).build();
                .build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Urls.BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

        contactApi = retrofit.create(ContactApi.class);




        @Override
    public void requestContact(ContactCallback contactUsCallback) {

    }

    @Override
    public void onDestroy() {

    }
}

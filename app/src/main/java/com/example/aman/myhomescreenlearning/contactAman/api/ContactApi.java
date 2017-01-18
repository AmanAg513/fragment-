package com.example.aman.myhomescreenlearning.contactAman.api;

import com.example.aman.myhomescreenlearning.contactAman.model.ContactData;
import com.example.aman.myhomescreenlearning.helper.Urls;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by aman on 18/1/17.
 *
 */
public interface ContactApi {

    @GET(Urls.REQUEST_SPLASH_SCREEN)
    Call <ContactData> request ContactApi();
}

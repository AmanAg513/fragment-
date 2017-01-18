package com.example.aman.myhomescreenlearning.contactAman.model;

/**
 * Created by aman on 18/1/17.
 */
public interface ContactProvider {
    void requestContact(ContactCallback contactUsCallback);

    void onDestroy();

}

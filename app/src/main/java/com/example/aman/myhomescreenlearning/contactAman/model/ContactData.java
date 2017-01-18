package com.example.aman.myhomescreenlearning.contactAman.model;

/**
 * Created by aman on 18/1/17.
 */
public class ContactData {

    private String message;
    private int version;
    private boolean success;
    private int compulsary_update;

    public ContactData(String message, int version, boolean success, int compulsary_update) {
        this.message = message;
        this.version = version;
        this.success = success;
        this.compulsary_update = compulsary_update;
    }

    public String getMessage() {
        return message;
    }

    public int getVersion() {
        return version;
    }

    public boolean isSuccess() {
        return success;
    }

    public int getCompulsary_update() {
        return compulsary_update;
    }
}

package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
            .applicationId("61U3fHjfShiomEjz9STEVkLE34rVl6nQwEM9NvfY")
            .clientKey("x4hjWXy9B7lAYFq5jGOhU1gkuT70Uxc5oke1j0Vr")
            .server("https://parseapi.back4app.com")
            .build()
        );
    }
}

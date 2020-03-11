package com.example.zarslapg;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("zarsla-parstagram") // should correspond to APP_ID env variable
                .clientKey("ZarslaParserEpic")  // set explicitly unless clientKey is explicitly configured on Parse server
                .server("https://zarsla-parstagram.herokuapp.com/parse/").build());
    }
}

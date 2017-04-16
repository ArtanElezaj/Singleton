package com.artan.singleton;

import android.util.Log;



public class MySingleton {

    static MySingleton obj ;

    private MySingleton(){

        Log.e("TEST", "One Object!");

    }

    public static MySingleton getInstance(){
        obj = new MySingleton();

        return obj;
    }


}

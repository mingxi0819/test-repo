package com.cb.unittest;

/**
 * Created by user on 16/3/22.
 */
public class TestObject {

    public boolean equalOrNot(String string){
        if (null != string && string.equalsIgnoreCase("123")){
            return true;
        }
        return false;
    }
}


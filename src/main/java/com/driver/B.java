package com.driver;

public class B extends A{
    @Override
    String meth(){
        return "Method is overridden in Extended class B";
    }

    public B() {
        String meth = new A().meth();
    }
}

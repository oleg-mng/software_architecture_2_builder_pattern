package org.inwork;

public class Director {
    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(){
        builder.BuildPartA();
        builder.BuildPartB();
        builder.BuildPartC();
    }

}

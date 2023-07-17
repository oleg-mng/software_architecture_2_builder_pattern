package org.inwork;

import org.inwork.components.*;

public class Main {
    public static void main(String[] args) {
        // общая схема работы паттерна
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();
        Product product = builder.getResult();

        for (int i = 0; i < product.parts.size(); i++) {
            System.out.println(product.parts.get(i));
        }
        System.out.println();

        //работа паттерна на примере работы выпечки хлеба
        Baker baker = new Baker();
        BreadBuilder breadBuilder = new RyeBreadBuilder();
        Bread ryeBread = baker.bake(breadBuilder);
        System.out.println(ryeBread.toString());
        breadBuilder = new WheatBreadBuilder();
        Bread wheatBread = baker.bake(breadBuilder);
        System.out.println(wheatBread.toString());


    }
}
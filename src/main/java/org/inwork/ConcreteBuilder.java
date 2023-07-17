package org.inwork;

public class ConcreteBuilder extends Builder{
    Product product = new Product();
    @Override
    public void BuildPartA() {
        product.add("Part A");
    }

    @Override
    public void BuildPartB() {
        product.add("Part B");

    }

    @Override
    public void BuildPartC() {
        product.add("Part C");

    }

    @Override
    public Product getResult() {
        return product;
    }
}

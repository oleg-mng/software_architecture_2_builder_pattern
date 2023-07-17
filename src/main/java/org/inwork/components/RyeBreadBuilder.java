package org.inwork.components;

/*
строитель для ржаного хлеба
 */
public class RyeBreadBuilder extends BreadBuilder{


    @Override
    public void setFlour() {
        this.bread.flour = new Flour("Ржаная мука");
    }

    @Override
    public void setSalt() {
        this.bread.salt = new Salt();
    }

    @Override
    public void setAdditives() {

    }
}

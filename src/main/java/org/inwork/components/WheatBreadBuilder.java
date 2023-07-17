package org.inwork.components;
/*
строитель для пшеничного хлеба
 */

public class WheatBreadBuilder extends BreadBuilder{
    @Override
    public void setFlour() {
        this.bread.flour = new Flour("Пшеночная мука Сорт I");
    }

    @Override
    public void setSalt() {
        this.bread.salt = new Salt();
    }

    @Override
    public void setAdditives() {
        this.bread.additives = new Additives("Добавка Pro");

    }
}

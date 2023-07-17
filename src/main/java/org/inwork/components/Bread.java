package org.inwork.components;

public class Bread {
    public Flour flour;
    public Salt salt;
    public Additives additives;

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (flour != null) {
            stringBuilder.append(flour.sort + "\n");
        }
        if (salt != null) {
            stringBuilder.append("Соль\n");
        }
        if (additives != null) {
            stringBuilder.append("Добавки" + additives.name + "\n");
        }

        return stringBuilder.toString();
    }
}

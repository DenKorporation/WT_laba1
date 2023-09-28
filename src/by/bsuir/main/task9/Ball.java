package by.bsuir.main.task9;

import java.awt.*;

public class Ball {
    private double weight;
    private double volume;
    private Color color;

    public Ball(double weight, double volume, Color color) {
        this.weight = weight;
        this.volume = volume;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public double getVolume() {
        return volume;
    }

    public Color getColor() {
        return color;
    }
}

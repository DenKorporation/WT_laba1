package by.bsuir.main.task9;

import java.awt.*;
import java.util.ArrayList;

public class Basket {
    private double capacity;
    private double curCapacity = 0;
    private ArrayList<Ball> balls = new ArrayList<>();

    public Basket(double capacity) {
        this.capacity = capacity;
    }

    public void addBall(Ball ball) {
        if (ball == null){
            throw new RuntimeException("Ball ball is null");
        }
        if (curCapacity + ball.getVolume() <= capacity){
            balls.add(ball);
            curCapacity += ball.getVolume();
        }else {
            throw new RuntimeException("The basket is full");
        }
    }

    public double getTotalWeight() {
        double total = 0;
        for (Ball ball : balls){
            total += ball.getWeight();
        }

        return total;
    }

    public int getNumberOfBlue(){
        int count = 0;
        for (Ball ball:balls) {
            if (ball.getColor().equals(Color.BLUE)){
                count++;
            }
        }

        return count;
    }
}

package by.bsuir.main.task9;

import java.awt.*;

public class Main {

    public static void main(String[] args){
        Basket basket = new Basket(5);
        basket.addBall(new Ball(1.2, 1.5,Color.GREEN));
        basket.addBall(new Ball(0.1, 0.5, Color.BLUE));
        basket.addBall(new Ball(7.6, 0.7, Color.WHITE));
        basket.addBall(new Ball(2.0, 0.3, Color.YELLOW));
        basket.addBall(new Ball(0.2, 1.4, Color.BLUE));
        basket.addBall(new Ball(1.7, 0.6, Color.BLUE));

        System.out.println(basket.getTotalWeight());
        System.out.println(basket.getNumberOfBlue());
    }
}

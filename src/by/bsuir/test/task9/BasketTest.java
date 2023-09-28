package by.bsuir.test.task9;

import by.bsuir.main.task9.Ball;
import by.bsuir.main.task9.Basket;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {
    private static Basket basket;

    @BeforeAll
    static void setUp() {
        basket = new Basket(5);
        basket.addBall(new Ball(1.2, 1.5, Color.GREEN));
        basket.addBall(new Ball(0.1, 0.5, Color.BLUE));
        basket.addBall(new Ball(7.6, 0.7, Color.WHITE));
        basket.addBall(new Ball(2.0, 0.3, Color.YELLOW));
        basket.addBall(new Ball(0.2, 1.4, Color.BLUE));
        basket.addBall(new Ball(1.7, 0.6, Color.BLUE));
    }

    @Test
    void getTotalWeight() {
        Assertions.assertTrue(Math.abs(12.8 - basket.getTotalWeight()) < 0.05);
    }

    @Test
    void getNumberOfBlue() {
        Assertions.assertEquals(3, basket.getNumberOfBlue());
    }

    @Test
    void outOfVolume() {
        Basket testBasket = new Basket(3);

        Assertions.assertThrows(RuntimeException.class, ()->{testBasket.addBall(new Ball(2, 5, Color.GREEN));});
    }

    @Test
    void nullBall() {
        Basket testBasket = new Basket(3);

        Assertions.assertThrows(RuntimeException.class, ()->{testBasket.addBall(null);});
    }

}
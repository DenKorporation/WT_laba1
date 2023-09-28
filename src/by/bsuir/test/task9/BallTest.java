package by.bsuir.test.task9;

import by.bsuir.main.task9.Ball;
import org.junit.jupiter.api.*;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {
    private static Ball ball;

    @BeforeAll
    static void setUp() {
        ball = new Ball(15.3, 1.2, Color.GREEN);
    }

    @Test
    void getWeight(){
        Assertions.assertEquals(15.3, ball.getWeight());
    }

    @Test
    void getVolume(){
        Assertions.assertEquals(1.2, ball.getVolume());
    }

    @Test
    void getColor(){
        Assertions.assertEquals(Color.GREEN, ball.getColor());
    }
}
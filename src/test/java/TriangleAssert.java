import org.junit.jupiter.api.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.logging.*;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.logging.Level;



public class TriangleAssert{

    Triangle triangle = new Triangle();
    private static Logger logger = LoggerFactory.getLogger(TriangleAssert.class);



    @BeforeAll
    static void beforeAllTests() {
        logger.info("Before all tests");
    }

    @BeforeEach
    public void setUp(){
        logger.info("Test begins!");
    }

    @Test
    @DisplayName("Позитивный тест")
    public void PositiveTest() {

        int a = 2;
        int b = 7;
        int c = 7;
        double p1 = (a + b + c) / 2.0;
        double s = Math.sqrt(p1 * (p1 - a) * (p1 - b) * (p1 - c));
        System.out.println("Area:"+s);

        assert a != 0;
        assert b != 0;
        assert c != 0;

    }

    @Test
    @DisplayName("Негативный тест")
    public void NegativeTest() {

        int a = 0;
        int b = 1;
        int c = 9;
        double p1 = (a + b + c) / 2.0;
        double s = Math.sqrt(p1 * (p1 - a) * (p1 - b) * (p1 - c));
        System.out.println("Area:"+s);

        assert a != 0;
        assert b != 0;
        assert c != 0;



    }


    @AfterEach
    public void tearDown(){
        logger.info("Test completed!");
    }


    @AfterAll
    static void afterAllTests() {
        logger.info("After all tests");
    }


    public void info(Supplier<String> msgSupplier) {
        log(Level.INFO, msgSupplier);
    }

    private void log(Level info, Supplier<String> msgSupplier) {

    }


}
package triangle;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {


    @Test
    void isScaleneTest() {

        Triangle test1 = new Triangle(1.0, 2.0, 3.0);

        assertTrue(test1.isScalene());

    }

    @Test
    void isEquilateralTest() {

        Triangle test2 = new Triangle(new double[]{2.0, 2.0, 2.0});

        assertThat(test2.isEquilateral()).isTrue();

    }

    @Test
    void isIsoscelesTest() {

        Triangle test3 = new Triangle(new Point(1, 1), new Point(1, 1),
                new Point(2, 2));

        assertThat(test3.isIsosceles()).isTrue();

    }

    @Test
    void isNotScaleneTest() {

        Triangle test4 = new Triangle(new Point[]{new Point(1, 1),
                new Point(1, 1),
                new Point(1, 2)});

        assertThat(test4.isScalene()).isFalse();

    }

    @Test
    void isNotEquilateral(){

        Triangle test5 = new Triangle(1, 1, 3);

        assertThat(test5.isEquilateral()).isFalse();

    }

    @Test
    void isNotIsoceles() {

        Triangle test6 = new Triangle(1, 3, 2);

        assertThat(test6.isIsosceles()).isFalse();

    }
}
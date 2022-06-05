import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JapaneseFlowerTest {

    @Test
    void testCreation() {
        Flower flower1 = new JapaneseFlower("Red");

        assertTrue(flower1.clone() instanceof   Flower);
    }

    @Test
    void testColor() {
        Flower flower1 = new JapaneseFlower("Red");
        Flower flower2 = (Flower) flower1.clone();
        assertTrue(flower2.color ==  flower1.color);
    }

}
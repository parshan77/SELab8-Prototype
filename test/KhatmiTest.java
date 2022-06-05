import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KhatmiTest {

    @Test
    void testCreation() {
        Flower flower1 = new Khatmi("Pink");

        assertTrue(flower1.clone() instanceof   Flower);
    }

    @Test
    void testColor() {
        Flower flower1 = new Khatmi("Pink");
        Flower flower2 = (Flower) flower1.clone();
        assertTrue(flower2.color ==  flower1.color);
    }

}
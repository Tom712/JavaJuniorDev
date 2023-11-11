import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ObdlznikTest {

    @Test
    void obvod() {
        assertEquals(8, Obdlznik.obvod(2, 2));
    }

    @Test
    void obsah() {
        assertEquals(4, Obdlznik.obsah(2, 2));
    }
}
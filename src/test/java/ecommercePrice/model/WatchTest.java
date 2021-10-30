<<<<<<< HEAD
package ecommercePrice.model;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WatchTest {
    public WatchTest() {
    }

    @Test
    public void test() {
        Watch w = new Watch("Rolex", 100, 0.667D);
        assertEquals(w.getWatchName(), "Rolex");
        assertEquals(w.getUnitPrice(), 100);
        assertEquals(w.getDiscountRatio(), 0.667D);
    }
}
=======
package ecommercePrice.model;public class WatchTest {
}
>>>>>>> Merge applications

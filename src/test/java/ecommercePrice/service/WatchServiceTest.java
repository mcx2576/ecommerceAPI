package ecommercePrice.service;
import ecommercePrice.model.Watch;
import ecommercePrice.service.WatchService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WatchServiceTest {
    public WatchServiceTest() {
    }
    WatchService WatchMap ;

    @Test
    public void test() {
//        Testing the getter and setter methods in Watch Service
        WatchMap = new WatchService();
        WatchMap.addWatchitem("001", "Rolex", 100, 0.667);
        Watch w = WatchMap.getWatch("001");
        assertEquals(w.getWatchName(), "Rolex");
        assertEquals(w.getUnitPrice(), 100);
        assertEquals(w.getDiscountRatio(), 0.667D);
    }
    @Test
    public void Caltest() {
//        Testing the calculate function
        WatchMap = new WatchService();
        WatchMap.setWatchHashMap();
        assertEquals(WatchMap.calWatchPrice("001", 3), 200);
        assertEquals(WatchMap.calWatchPrice("002", 2), 120);
        assertEquals(WatchMap.calWatchPrice("003", 2), 100);
        assertEquals(WatchMap.calWatchPrice("001", 1), 100);
    }
}
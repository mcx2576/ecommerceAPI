package ecommercePrice.service;

import ecommercePrice.model.Watch;
import java.util.Hashtable;
import org.springframework.stereotype.Service;

@Service
public class WatchService {
    Hashtable<String, Watch> watchHashMap = new Hashtable();

    public WatchService() {
    }

    public void setWatchHashMap() {
        this.watchHashMap.put("001", new Watch("Rolex", 100, 0.667D));
        this.watchHashMap.put("002", new Watch("Michael Kors", 80, 0.75D));
        this.watchHashMap.put("003", new Watch("Swatch", 50, 1.0D));
        this.watchHashMap.put("004", new Watch("Casio", 30, 1.0D));
    }

    public void addWatchitem(String ID, String WatchName, int UnitPrice, double DiscountRatio) {
        this.watchHashMap.put(ID, new Watch(WatchName, UnitPrice, DiscountRatio));
    }

    public Watch getWatch(String id) {
        return (Watch)this.watchHashMap.get(id);
    }

    public int calWatchPrice(String id, int count) {
        Watch w;
        double price;
        if (id.equals("001")) {
            w = this.getWatch(id);
            price = (double)(count / 3 * w.getUnitPrice()) * w.getDiscountRatio() * 3.0D;
            return count % 3 * w.getUnitPrice() + (int)price;
        } else if (id.equals("002")) {
            w = this.getWatch(id);
            price = (double)(count / 2 * w.getUnitPrice()) * w.getDiscountRatio() * 2.0D;
            return count % 2 * w.getUnitPrice() + (int)price;
        } else {
            w = this.getWatch(id);
            return count * w.getUnitPrice();
        }
    }
}

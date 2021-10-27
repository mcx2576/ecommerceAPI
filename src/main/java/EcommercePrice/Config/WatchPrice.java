package EcommercePrice.Config;
import java.util.Objects;

public class WatchPrice {
    private Long WatchID;
    private String WatchName;
    private int UnitPrice;
    private float DiscountRatio;
    public WatchPrice() {
    }
    public WatchPrice(Long WatchID, String WatchName, int UnitPrice, float DiscountRatio) {
        this.WatchID = WatchID;
        this.WatchName = WatchName;
        this.UnitPrice = UnitPrice;
        this.DiscountRatio = DiscountRatio;
    }
    public Long getWatchID() {
        return WatchID;
    }

    public String getWatchName() {
        return WatchName;
    }

    public int getUnitPrice() {
        return UnitPrice;
    }

    public float getDiscountRatio() {
        return DiscountRatio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WatchPrice that = (WatchPrice) o;
        return UnitPrice == that.UnitPrice && WatchID.equals(that.WatchID) && WatchName.equals(that.WatchName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(WatchID, WatchName, UnitPrice);
    }
}

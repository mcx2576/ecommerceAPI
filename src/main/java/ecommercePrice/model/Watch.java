package ecommercePrice.model;

import java.util.Objects;

public class Watch {
    private String WatchName;
    private int UnitPrice;
    private double DiscountRatio;

    public void setWatchName(String watchName) {
        this.WatchName = watchName;
    }

    public void setUnitPrice(int unitPrice) {
        this.UnitPrice = unitPrice;
    }

    public void setDiscountRatio(double discountRatio) {
        this.DiscountRatio = discountRatio;
    }

    public Watch(String WatchName, int UnitPrice, double DiscountRatio) {
        this.WatchName = WatchName;
        this.UnitPrice = UnitPrice;
        this.DiscountRatio = DiscountRatio;
    }

    public String getWatchName() {
        return this.WatchName;
    }

    public int getUnitPrice() {
        return this.UnitPrice;
    }

    public double getDiscountRatio() {
        return this.DiscountRatio;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Watch that = (Watch)o;
            return this.UnitPrice == that.UnitPrice && this.WatchName.equals(that.WatchName);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.WatchName, this.UnitPrice});
    }
}

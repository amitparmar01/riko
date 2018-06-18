package com.github.rishabh9.riko.upstox.users.models;

import com.google.common.base.MoreObjects;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class Holding {

    private List<Instrument> instruments;

    private String product;

    @SerializedName("collateral_type")
    private String collateralType;

    @SerializedName("cnc_used_quantity")
    private long cncUsedQuantity;

    private long quantity;

    @SerializedName("collateral_qty")
    private long collateralQuantity;

    @SerializedName("haircut")
    private BigDecimal haircutPercentage;

    @SerializedName("avg_price")
    private BigDecimal averagePrice;

    public List<Instrument> getInstruments() {
        return instruments;
    }

    public void setInstruments(List<Instrument> instruments) {
        this.instruments = instruments;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getCollateralType() {
        return collateralType;
    }

    public void setCollateralType(String collateralType) {
        this.collateralType = collateralType;
    }

    public long getCncUsedQuantity() {
        return cncUsedQuantity;
    }

    public void setCncUsedQuantity(long cncUsedQuantity) {
        this.cncUsedQuantity = cncUsedQuantity;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public long getCollateralQuantity() {
        return collateralQuantity;
    }

    public void setCollateralQuantity(long collateralQuantity) {
        this.collateralQuantity = collateralQuantity;
    }

    public BigDecimal getHaircutPercentage() {
        return haircutPercentage;
    }

    public void setHaircutPercentage(BigDecimal haircutPercentage) {
        this.haircutPercentage = haircutPercentage;
    }

    public BigDecimal getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(BigDecimal averagePrice) {
        this.averagePrice = averagePrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Holding holding = (Holding) o;
        return cncUsedQuantity == holding.cncUsedQuantity &&
                quantity == holding.quantity &&
                collateralQuantity == holding.collateralQuantity &&
                Objects.equals(instruments, holding.instruments) &&
                Objects.equals(product, holding.product) &&
                Objects.equals(collateralType, holding.collateralType) &&
                Objects.equals(haircutPercentage, holding.haircutPercentage) &&
                Objects.equals(averagePrice, holding.averagePrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instruments, product, collateralType, cncUsedQuantity, quantity,
                collateralQuantity, haircutPercentage, averagePrice);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("instruments", instruments)
                .add("product", product)
                .add("collateralType", collateralType)
                .add("cncUsedQuantity", cncUsedQuantity)
                .add("quantity", quantity)
                .add("collateralQuantity", collateralQuantity)
                .add("haircutPercentage", haircutPercentage)
                .add("averagePrice", averagePrice)
                .toString();
    }
}
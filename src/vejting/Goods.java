/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vejting;

/**
 *
 * @author Morten, Kim & Jonas
 */
public class Goods {

    private String goodsType;
    private int fromAmount;
    private int toAmount;
    private int pricePrKm;
    private int maxWeight;
    private int id;

    public Goods(int id, String goodsType, int fromAmount, int toAmount, int pricePrKm, int maxWeight) {
        this.id = id;
        this.goodsType = goodsType;
        this.fromAmount = fromAmount;
        this.toAmount = toAmount;
        this.pricePrKm = pricePrKm;
        this.maxWeight = maxWeight;
    }

    public int getId() {
        return id;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public int getFromAmount() {
        return fromAmount;
    }

    public int getToAmount() {
        return toAmount;
    }

    public int getPricePrKm() {
        return pricePrKm;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public String toString() {
        String type = "";
        if ("Pallefragt".equals(goodsType)) {
            type = "paller";
        }
        if ("Stykgods".equals(goodsType) || "Specialfragt".equals(goodsType)) {
            type = "m³";
        }
        return goodsType + ": " + fromAmount + " - " + toAmount + " " + type;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vejting;

/**
 *
 * @author Morten, Kim & Jonas
 */
public class Order {

    private String deliverydate;
    private boolean dangerGoods;
    private double price;
    private String comment;
    private Customer customer;
    private Route route;
    private Truck truck;
    private TruckDriver truckdriver;
    private Goods goods;
    private String pickUpName;
    private String pickUpAddress;
    private int pickUpZip;
    private String deliveryName;
    private String deliveryAddress;
    private int deliveryZip;

    public Order(String deliverydate, boolean dangerGoods, double price, String comment, Customer customer, Route route, Truck truck, TruckDriver truckdriver, Goods goods, String pickUpName, String pickUpAddress, int pickUpZip, String deliveryName, String deliveryAddress, int deliveryZip) {
        this.deliverydate = deliverydate;
        this.dangerGoods = dangerGoods;
        this.price = price;
        this.comment = comment;
        this.customer = customer;
        this.route = route;
        this.truck = truck;
        this.truckdriver = truckdriver;
        this.goods = goods;
        this.pickUpName = pickUpName;
        this.pickUpAddress = pickUpAddress;
        this.pickUpZip = pickUpZip;
        this.deliveryName = deliveryName;
        this.deliveryAddress = deliveryAddress;
        this.deliveryZip = deliveryZip;
    }

    public String getDeliverydate() {
        return deliverydate;
    }

    public boolean isDangerGoods() {
        return dangerGoods;
    }

    public double getPrice() {
        return price;
    }

    public String getComment() {
        return comment;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Route getRoute() {
        return route;
    }

    public Truck getTruck() {
        return truck;
    }

    public TruckDriver getTruckdriver() {
        return truckdriver;
    }

    public Goods getGoods() {
        return goods;
    }

    public String getPickUpName() {
        return pickUpName;
    }

    public String getPickUpAddress() {
        return pickUpAddress;
    }

    public int getPickUpZip() {
        return pickUpZip;
    }

    public String getDeliveryName() {
        return deliveryName;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public int getDeliveryZip() {
        return deliveryZip;
    }

    public String toString() {
        return deliverydate + " : " + route.getFromCity() + " - " + route.getToCity() + " Køres af: " + truckdriver.getName() + ". Med bil: " + truck;
    }
}

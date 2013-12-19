/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vejting;

/**
 *
 * @author Morten, Kim & Jonas
 */
public class Route {

    private String fromCity;
    private String toCity;
    private int distance;
    private int id;

    public Route(int id, String fromCity, String toCity, int distance) {
        this.id = id;
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.distance = distance;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }

    public void setToCity(String toCity) {
        this.toCity = toCity;
    }

    public int getId() {
        return id;
    }

    public String getFromCity() {
        return fromCity;
    }

    public String getToCity() {
        return toCity;
    }

    public int getDistance() {
        return distance;
    }

    public String toString() {
        return fromCity + " - " + toCity;
    }
}

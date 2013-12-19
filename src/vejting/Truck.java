/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vejting;

/**
 *
 * @author Morten, Kim & Jonas
 */
public class Truck {

    private String name;
    private String licenceplate;
    private int maxPallet;
    private int maxM3;
    private int maxKg;
    private int id;

    public Truck(int id, String name, String licenceplate, int maxPallet, int maxM3, int maxKg) {
        this.id = id;
        this.name = name;
        this.licenceplate = licenceplate;
        this.maxPallet = maxPallet;
        this.maxM3 = maxM3;
        this.maxKg = maxKg;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLicenceplate() {
        return licenceplate;
    }

    public int getMaxPallet() {
        return maxPallet;
    }

    public int getMaxM3() {
        return maxM3;
    }

    public int getMaxKg() {
        return maxKg;
    }

    public String toString() {
        return name + " (" + licenceplate + ")";
    }
}

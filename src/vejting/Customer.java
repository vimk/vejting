/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vejting;

/**
 *
 * @author Morten, Kim & Jonas
 */
public class Customer {

    private String name;
    private String address;
    private int zip;
    private String city;
    private int id;

    public Customer(int id, String name, String address, int zip, String city) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.zip = zip;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getZip() {
        return zip;
    }

    public String getCity() {
        return city;
    }

    public String toString() {
        return name;
    }
}

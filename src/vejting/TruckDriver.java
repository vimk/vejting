/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vejting;

/**
 *
 * @author Morten, Kim & Jonas
 */
public class TruckDriver {

    private String name;
    private String certificate;
    private int id;

    public TruckDriver(int id, String name, String certificate) {
        this.id = id;
        this.name = name;
        this.certificate = certificate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCertificate() {
        return certificate;
    }

    public String toString() {
        return name + " " + certificate;
    }
}

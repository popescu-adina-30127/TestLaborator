
package aut.utcluj.isp.ex2;

public class Drone {
    private String id;
    private boolean state;

    public String getId() {
        return id;
    }

    public boolean isState() {
        return state;
    }


    public String flight() {
        return "Stealth Drone " + id + " is up.";
    }
}


package aut.utcluj.isp.ex1;

import java.util.Objects;

public class Drone {

    private String id;
    private boolean state;

    Drone(String dR1, boolean b) {
        this.id = dR1;
        this.state = b;
    }


    Drone(String dR3) {
        this.id = dR3;
        this.state = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drone drone = (Drone) o;
        return state == drone.state &&
                Objects.equals(id, drone.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, state);
    }

    @Override
    public String toString() {
        return "Drone_" + id ;
    }

    public String getId() {
        return id;
    }

    public boolean isState() {
        return state;
    }

}

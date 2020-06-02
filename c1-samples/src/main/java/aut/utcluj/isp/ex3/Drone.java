package aut.utcluj.isp.ex3;

import java.util.Objects;

public class Drone {

    private String id;
    private boolean started;
    private int altitude;

    Drone(String d1, boolean b, int i) {
        this.id = d1;
        this.started = b;
        this. altitude = i;
    }

    Drone() {
        this.id = "D0";
        this.started = true;
        this.altitude = 0;
    }

    Drone(String dR3, boolean b) {
        this.id = dR3;
        this.started = b;
        this.altitude = 0;
    }

    /**
     * Move the drone up.
     * Altitude will be incremented by 1 unit each time this method is invoked
     */
    public void moveUp() {
        this.altitude++ ;
    }

    /**
     * Move the drone down
     * Altitude will be decremented by 1 unit each time this method is invoked
     */
    public void moveDown() {
        this.altitude--;
    }

    /**
     * Retrieve the current altitude
     * @return current altitude
     */
    public int getAltitude() {
        return this.altitude;
    }

    public String getId() {
        return this.id;
    }

    public boolean isStarted(){
        return this.started;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drone drone = (Drone) o;
        return started == drone.started &&
                altitude == drone.altitude &&
                Objects.equals(id, drone.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, started, altitude);
    }
}



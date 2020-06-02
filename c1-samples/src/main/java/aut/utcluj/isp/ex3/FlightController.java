/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aut.utcluj.isp.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author mihai.hulea
 */
public class FlightController {

    private ArrayList<Drone> drone = new ArrayList<Drone>();

    /**
     * Add new drone
     *
     * @param d - drone to be added
     */
    public void addDrone(Drone d) {
        drone.add(d);
    }

    /**
     * Find drone by id
     *
     * @param id - unique drone id
     * @return {@link Drone} instance or null if not found
     */
    public Drone findById(String id) {
        for (int i = 0; i < drone.size(); i++) {
            if (drone.get(i).getId().equals(id))
                return drone.get(i);
        }
        return null;
    }

    /**
     * Get all drones with a specific state
     *
     * @param state - desired state (true / false)
     * @return list of drones with specific state. If not drones are found, an empty list will be returned
     */
    public List<Drone> getAllByState(boolean state) {
        ArrayList<Drone> DronesByState = new ArrayList<Drone>();
        for (int i = 0; i < drone.size(); i++) {
            if (drone.get(i).isStarted() == state)
                DronesByState.add(drone.get(i));
        }
        return DronesByState;
    }

    /**
     * Remove drone by a specific id
     *
     * @param id - unique drone id
     */
    public void remove(String id) {
        for (int i = 0; i < drone.size(); i++) {
            if (drone.get(i).getId().equals(id))
                drone.remove(i);
        }
    }

    /**
     * Return number of entities.
     *
     * @return
     */
    public int count() {
        return drone.size();
    }
}

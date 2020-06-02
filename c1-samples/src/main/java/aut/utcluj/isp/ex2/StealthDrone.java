/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aut.utcluj.isp.ex2;

/**
 * @author mihai.hulea
 */
public class StealthDrone extends Drone{
    private String destination;
    private String id;
    private boolean started;

    public StealthDrone(String sdR1, boolean b, String cluj) {
        this.destination=cluj;
        this.id=sdR1;
        this.started=b;
    }

    @Override
    public String flight() {
        if(this.started==true)return "Stealth Drone "+this.id+" is up.";
        return "Stealth Drone "+this.id+" is down.";
    }

}

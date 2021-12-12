/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airline;

import Business.Order.Order;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Airline {
    private String adminUName;
    private ArrayList<Airplane> airplaneList;
    private ArrayList<Flight> flightList;
    private ArrayList<Order> orderList;
    private String name;

    public ArrayList<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(ArrayList<Flight> flightList) {
        this.flightList = flightList;
    }
    
    public void addFlight(String id, String originalplaceName, String destinationplaceName, Airplane airplane, String cost) {
        Flight flight = new Flight();
        flight.setFlight_id(id);
        flight.setOriginalplaceName(originalplaceName);
        flight.setDestinationplaceName(destinationplaceName);
        flight.setCost(cost);
        flight.setStatus("New Flight");
        flightList.add(flight);
    }
    
    public ArrayList<Airplane> getAirplaneList() {
        return airplaneList;
    }
    
    public void addAirplane(Airplane airplane){
        airplaneList.add(airplane);
    }
    
    public void removeAirplane(Airplane airplane){
        airplaneList.remove(airplane);
    }
    
    public String getAdminUName() {
        return adminUName;
    }
    
    public void setAdminUName(String adminUName) {
        this.adminUName = adminUName;
    }
    
    public Airline(String Name, String UName) {
        this.name = Name;
        this.adminUName=UName;
        airplaneList=new ArrayList<Airplane>();
        flightList=new ArrayList<Flight>();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return adminUName;
    }
}

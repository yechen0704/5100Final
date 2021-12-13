/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airline;

import Business.Customer.Customer;
import java.util.ArrayList;

/**
 *
 * @author 刘欣卓
 */
public class Flight {
    private String flight_id;
    private String originalplace;
    private String destinationplace;
    private String status;
    private Airplane usedAirplane;
    private String cost;
    private String departureTime;
    private ArrayList<Customer> customerList;
    private String arrivingTime;

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }

    public String getArrivingTime() {
        return arrivingTime;
    }

    public void setArrivingTime(String arrivingtime) {
        this.arrivingTime = arrivingtime;
    }

    
    public String getFlight_id() {
        return flight_id;
    }

    public void setFlight_id(String flight_id) {
        this.flight_id = flight_id;
    }

    public String getOriginalplace() {
        return originalplace;
    }

    public void setOriginalplace(String originalplaceName) {
        this.originalplace = originalplaceName;
    }

    public String getDestinationplace() {
        return destinationplace;
    }

    public void setDestinationplace(String destinationplaceName) {
        this.destinationplace = destinationplaceName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Airplane getUsedAirplane() {
        return usedAirplane;
    }

    public void setUsedAirplane(Airplane usedAirplane) {
        this.usedAirplane = usedAirplane;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
    
    @Override
    public String toString(){
        return flight_id;
    }
}

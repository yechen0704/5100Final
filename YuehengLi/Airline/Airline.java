/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airline;

import Business.Order.Order;
import java.util.ArrayList;
import java.util.UUID;

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

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    public ArrayList<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(ArrayList<Flight> flightList) {
        this.flightList = flightList;
    }
    
    public void addFlight(String id, String originalplaceName, String destinationplaceName, Airplane airplane, String cost) {
        Flight flight = new Flight();
        flight.setFlight_id(id);
        flight.setOriginalplace(originalplaceName);
        flight.setDestinationplace(destinationplaceName);
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
    
    public Airline(String Name) {
        this.name = Name;
        airplaneList=new ArrayList<Airplane>();
        flightList=new ArrayList<Flight>();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Order addOrder(String customerName, String flight_id, String originalplace, String destinationplace, String departureTime, String arrivingTime, String airplane_id, String cost, String airline, boolean insurance){
        Order order = new Order();
        order.setFlight_id(flight_id);
        order.setOriginalplace(originalplace);
        order.setDestinationplace(destinationplace);
        order.setAirplane_id(airplane_id);
        order.setDepartureTime(departureTime);
        order.setArrivingTime(arrivingTime);
        order.setCost(cost);
        order.setAirline(airline);
        order.setInsurance(insurance);
        order.setCustomerName(customerName);
        order.setOrder_id(getUUID());
        orderList.add(order);
        return order;
    }
    
    public String getUUID(){
        UUID uuid=UUID.randomUUID();
        String str = uuid.toString(); 
        String uuidStr=str.replace("-", "");
        return uuidStr;
      }
    
    public void deleteOrder(String order_id){
        for(Order od: orderList){
            if(od.getOrder_id().equals(order_id)){
                orderList.remove(od);
            }
        }
    }
    
    public boolean checkIfUsernameIsUnique(String airplane_id){
        for (Airplane ap : airplaneList){
            if (ap.equals(airplane_id)){
                return false;
            }      
        }
        return true;
    }
    
    @Override
    public String toString() {
        return name;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airline;

/**
 *
 * @author 刘欣卓
 */
public class Flight {
    private String flight_id;
    private String originalplaceName;
    private String destinationplaceName;
    private String status;
    private Airplane usedAirplane;
    private String cost;

    public String getFlight_id() {
        return flight_id;
    }

    public void setFlight_id(String flight_id) {
        this.flight_id = flight_id;
    }

    public String getOriginalplaceName() {
        return originalplaceName;
    }

    public void setOriginalplaceName(String originalplaceName) {
        this.originalplaceName = originalplaceName;
    }

    public String getDestinationplaceName() {
        return destinationplaceName;
    }

    public void setDestinationplaceName(String destinationplaceName) {
        this.destinationplaceName = destinationplaceName;
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
    
    @Override
    public String toString(){
        return flight_id;
    }
}

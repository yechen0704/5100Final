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
public class Airplane {
    private String id;
    private int capacity;
    private boolean repairStatus;
    private boolean usingStatus;
    
    public Airplane(String id, int capacity, boolean repairStatus){
        this.id = id;
        this.capacity = capacity;
        this.repairStatus = repairStatus;
        this.usingStatus = false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isRepairStatus() {
        return repairStatus;
    }

    public void setRepairStatus(boolean repairStatus) {
        this.repairStatus = repairStatus;
    }

    public boolean isUsingStatus() {
        return usingStatus;
    }

    public void setUsingStatus(boolean usingStatus) {
        this.usingStatus = usingStatus;
    }
    
    @Override
    public String toString() {
        return id;
    }
}

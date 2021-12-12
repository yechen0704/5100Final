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
    private ArrayList<Airplane> Menu;
    private ArrayList<Order> orderList;
    int id=404;
    private String name;
    private String address;
    private String number;

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
    
    public void addOrder(String restaurentName, String customerName, String deliverMan, ArrayList<Airplane> Order, String cost, String deliveryAddress) {
        Order order=new Order();
        order.setOrder_id(String.valueOf(id));
        order.setCustomerName(customerName);
        order.setRestaurentName(restaurentName);
        order.setDeliverMan(deliverMan);
        order.setOrder(Order);
        order.setCost(cost);
        order.setDeliveryAddress(deliveryAddress);
        order.setStatus("New Request");
        orderList.add(order);
        id++;
    }
    
    public ArrayList<Airplane> getMenu() {
        return Menu;
    }
    
    public void addDishes(Airplane menu){
        Menu.add(menu);
    }
    
    public void removeDishes(Airplane menu){
        Menu.remove(menu);
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
        Menu=new ArrayList<Airplane>();
        orderList=new ArrayList<Order>();
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Order.Order;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Customer {
    int id=101;
    private String Name;
    private String UserName;
    private ArrayList<Order> orderList;
    private String address;
    private String number;
    public void addOrder(String restaurentName, String customerName, String deliverMan, String cost, String deliveryAddress) {
        Order order=new Order();
        order.setOrder_id(String.valueOf(id));
        order.setCustomerName(customerName);
        order.setRestaurentName(restaurentName);
        order.setDeliverMan(deliverMan);
        order.setCost(cost);
        order.setDeliveryAddress(deliveryAddress);
        order.setStatus("New Order");
        orderList.add(order);
        id++;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
    
    public Customer(String UserName){
        this.UserName=UserName;
        orderList=new ArrayList<Order>();
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> order) {
        this.orderList = order;
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
}

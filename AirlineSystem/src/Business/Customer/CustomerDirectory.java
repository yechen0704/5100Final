/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerList;
    private Customer customer;
    
    public ArrayList<Customer> getCustList() {
        return customerList;
    }
    
    public void setCustList(ArrayList<Customer> custList) {
        this.customerList = custList;
    }
    
    public CustomerDirectory(){
        this.customerList = new ArrayList<Customer>();
    }
    
    public Customer createCustomer(String uName){
        customer= new Customer(uName);
        customerList.add(customer);
        return customer;
    }
    
    public void deleteCustomer(String username){
        for(int i = 0;i < customerList.size(); i++){
            if(customerList.get(i).getUserName().equals(username)){
                customerList.remove(i);
            }
        }
    }
}

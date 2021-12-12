/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airline;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class AirlineDirectory {
     private ArrayList<Airline> airlineList;
    private Airline airline;
    private Airplane menu;
    public AirlineDirectory(){
        this.airlineList=new ArrayList<Airline>();
    }

    public ArrayList<Airline> getRestaurantList() {
        return airlineList;
    }

    public void setAirlineList(ArrayList<Airline> airlineList) {
        this.airlineList = airlineList;
    }
    
    public Airline createAirlineInfo(String Name, String uName){
        airline= new Airline(Name, uName);
        airlineList.add(airline);
        
        return airline;
    }
    
    public void deleteAirline(String username){
        for(int i=0;i<airlineList.size();i++){
            if(airlineList.get(i).getAdminUName().equals(username)){
                airlineList.remove(i);
            }
        }
    }
    
    public void updateRestaurantInfo(Airline airline,String name,String number,String address){
        airline.setName(name);
        airline.setAddress(address);
        airline.setNumber(number);
    }
    
    public Airplane AddMenuDishes(Airline airline,String id,int capacity){
        menu=new Airplane(id, capacity);
        airline.addDishes(menu);
        return menu;
    }
    
    public void DeleteDish(Airline restro,Airplane menu){
        restro.removeDishes(menu);
    }
}

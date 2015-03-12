/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelgui;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Luc
 */
public class Room {
    private int roomInfo;  
    private double price;
    private String roomNumber;
    private ArrayList<reserved> reservations = new ArrayList();
    
    public Room(String roomNum, double cost, int info)
    {
        roomNumber = roomNum;
        price = cost;
        roomInfo = roomInfo;
        
    }
    /**
     * Add a Reservation to a Room.
     * @param res 
     */
    public void addReservation(reserved res)
    {
        reservations.add(res);
    }
    
    /**
     * Is the room Reserved for the Given Date.
     * @param attempt
     * @return 
     */
    public Boolean isReserved(Date attempt)
    {
        
        return false;
    }
     
    /**
     * Return the number of the room
     * @return String
     */
    public String getRoomNumber()
    {
        return roomNumber;
    }
    
    /**
     * Return the Room information.
     * @return int
     */
    public int roomInfo()
    {
        return roomInfo;
    }
    
    /**
     * Return the price of the room.
     * @return double
     */
    public double getPrice()
    {
        return price;
    }
    
    /**
     * Set the Price up the Room
     * @param cost 
     */
    public void setPrice(double cost)
    {
        price = cost;
    }
    
    /**
     * Set the Room Information.
     * @param info 
     */
    public void setRoomInfo(int info)
    {
        roomInfo = info;
    }
    
    /**
     * Set the Room Number.
     * @param number 
     */
    public void setRoomNumber(String number)
    {
        roomNumber = number;
    }
}

/*

    public HotelRoom(int roomNum, double cost, int info)
 {
 roomNumber = roomNum;
 price = cost;
 roomInfo = info;
         
 }
 public void addReservation(reserved res)
 {
 reservations.add(res);
 }
 public Boolean isReserved(Date attempt)
 {
 for(reserved temp : reservations)
 {
 if (temp.isAvailable(attempt))
 return true;
 }
 return false;
 }
    
*/

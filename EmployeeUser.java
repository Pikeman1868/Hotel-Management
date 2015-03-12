/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelgui;

import javax.swing.JOptionPane;

/**
 *
 * @author PikeMobile
 */
public class EmployeeUser implements UserFeatures{
    
    public void getUserTable()
    {
        JOptionPane.showMessageDialog(null, "This feature is for Admin use only");
    }
    
    /**
     * Check in the desired User to the selected Room.
     * @param user 
     * @param Room
     */
    public void checkIn(UserInformation user/*, Room*/)
    {
        
    }
    
    /**
     * Check out the desired User from the selected Room.
     * @param user 
     * @param Room
     */
    public void checkOut(UserInformation user/*, Room*/)
    {
        
    }
    
    /**
     * Set a room's price
     * @param Room
     * @param price
     */
    public void setPrice(/*Room, int price*/)
    {
        
    }
    
    /**
     * Add a discount to a customer's price.
     * 
     */
    public void addDiscount()
    {
        
    }
}

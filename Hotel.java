/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelgui;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 *
 * @author Luc
 */
public class Hotel {
    private ArrayList<Room> ROOMS = new ArrayList();
    private int RoomCount = 0;
    static Hotel instance = new Hotel();
    
    private Hotel()
    {
        
    }
    
    /**
     * Return the Static instance of this class.
     * @return hotel
     */
    public static Hotel getInstance()
    {
        if(instance == null)
        {
            instance = new Hotel();
        }
        return instance;
    }
    
    /**
     * Add a room to the hotel list.
     * @param temp 
     */
    public void addRoom (Room temp)
    {
        ROOMS.add(temp);
        RoomCount++;
    }
    
    /**
     * Get a total number of Rooms in Hotel
     * @return 
     */
    public int getRoomCount()
    {
        return RoomCount;
    }
    
    /**
     * Iterator Design Pattern
     */
    private static class StepThrough implements Iterator{ 		
		// start stepping through at i=0
                                private Hotel s;
		private int i = 0; 
		
                StepThrough(Hotel s1){
                     s = s1;
                }
                
                
		public boolean hasNext(){
                    return i < s.getRoomCount();
                }
                
                public Object next() throws NoSuchElementException{
                       if (i<s.getRoomCount())
                            return s.ROOMS.get(i++);
                       else throw new NoSuchElementException();
                }
                
                
                
                
	}
	
	public Iterator it() {
		return new StepThrough(this);
	}
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelgui;

import java.util.Date;

/**
 *
 * 
 */
public class reserved {
    private Date start, end;   // assume these are set to something
    private int userGUID;
    /**
    * Checks if the room is Available                        
    * @param takes  a date the user would like to reserve the room. 
    * Compares that date to the start and end dates
    */
    public Boolean isAvailable(Date request)
    {
        return true;       
    }
    /**
    * Creates a reservation                          
    * @param takes a start date and an end date for the reservation
    * Takes a GUID to identify the user. 
    */
    public reserved(Date s, Date e, int GUID)
    {

    }
    
}





/*
public class reserved {
    private Date start, end;   // assume these are set to something
    private int userGUID;
    public Boolean isAvailable(Date request)
    {
        if(start.compareTo(request)>0 && end.compareTo(request)<0)
        {
             System.out.println("Start is " + (start.compareTo(request)>0) + " End is " + (end.compareTo(request)<0));
        }
                //return false;
        
        return true;
        
    }
    public reserved(Date s, Date e, int GUID)
    {
        start = s;
        end = e;
        userGUID = GUID;
    }
    
}

*/

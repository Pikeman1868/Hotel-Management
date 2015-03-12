/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelgui;

/**
 *
 * @author PikeMobile
 */
public interface Iterator {
    
    /**
     * Is there more data to iterate.
     * @return 
     */
    public boolean hasNext();
    
    /**
     * Return the next object.
     * @return 
     */
    public Object next();
}

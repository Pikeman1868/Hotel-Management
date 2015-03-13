/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelgui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author PikeMobile
 */
public class AdminUser extends UserFeatures {
    
    public void getUserTable()
    {
        SQLiteJDBC database = SQLiteJDBC.getInstance();
        try{
                JTable table = new JTable(database.buildTableModel("USERS"));
                final JPopupMenu popupMenu = new JPopupMenu();
                JMenuItem deleteItem = new JMenuItem("Delete");
                deleteItem.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        
                        int row  = table.getSelectedRow();
                        System.out.println("Delete User: " + table.getValueAt(row, 3));
                        database.DeleteUser(table.getValueAt(row, 3).toString());
                        try
                        {
                            table.setModel(database.buildTableModel("USERS"));
                        }
                        catch(Exception ex)
                        {
                            
                        }
                    }
                });
                
                popupMenu.add(deleteItem);
                table.setComponentPopupMenu(popupMenu);
                JOptionPane.showMessageDialog(null, new JScrollPane(table));
            }
            catch ( Exception e ) 
            {
              System.err.println( e.getClass().getName() + ": " + e.getMessage() );
              System.exit(0);
            } 
    }
    
    /**
     * Check in the desired User to the selected Room.
     * @param user 
     * @param Room
     */
    public boolean checkIn(UserInformation user/*, Room*/)
    {
        return false;
    }
    
    /**
     * Check out the desired User from the selected Room.
     * @param user 
     * @param Room
     */
    public boolean checkOut(UserInformation user/*, Room*/)
    {
        return false;
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
    
    /**
     * Produce a form to Create a new room.
     */
    public void createRoom()
    {
        RoomOptions roomCreator = new RoomOptions(null, true);
        roomCreator.setVisible(true);
    }
    
    /**
     * Update a current Room's features.
     * @param room 
     */
    public void updateRoom(Room room)
    {
        RoomOptions roomCreator = new RoomOptions(null, true, room);
        roomCreator.setVisible(true);
    }
    
    /**
     * Produce a dialog to create a new User Account.
     */
    public void createUser()
    {
        CreateUser createUserForm = new CreateUser(null, true);
        createUserForm.setVisible(true);
    }
}

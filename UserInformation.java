/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelgui;

/**
 *
 * @author Troy Gilmore
 */
public class UserInformation {
    enum AccountType {Customer, Employee, Admin};
    protected String firstName = null;
    protected String lastName = null;
    protected String accountType = null;
    //private String username = null;
    protected String password = null;
    protected String emailAddress = null;
    protected boolean loggedin;
    protected UserFeatures feature = null;
    protected double AccountBalance = 0.0;
    
    /**
     * Default Contructor
     * 
     * @param FirstName
     * @param LastName
     * @param Password
     * @param EmailAddress
     * @param AccountType 
     */
    public UserInformation()
    {
        
    }
    
    public UserInformation(String FirstName, String LastName, 
            String Password, String EmailAddress, String AccountType)
    {
        this.SetFirstName(FirstName);
        this.SetLastName(LastName);
        //this.SetUsername(Username); 
        this.SetPassword(Password); 
        this.SetEmailAddress(EmailAddress);
        this.SetAccountType(AccountType);
        
        if(AccountType.equals("Customer"))
        {
            feature = new CustomerUser();
        }
        else if(AccountType.equals("Admin"))
        {
            feature = new AdminUser();
        }
        else if(AccountType.equals("Employee"))
        {
            feature = new EmployeeUser();
        }
        else
        {
            feature = new GuestUser();
        }
        
        loggedin = false;
    }
    
    public void UpdateUserInformation(String Field, String UpdateContent)
    {
        if(Field.equals("PASSWORD"))
        {
            this.SetPassword(UpdateContent);
        }
        else if(Field.equals("EMAILADDRESS"))
        {
            this.SetEmailAddress(UpdateContent);
        }
    }
    
    public boolean isLoggedIn()
    {
        return loggedin;
    }
    
    public void logout()
    {
        loggedin = false;
    }
    
    public void login()
    {
        loggedin = true;
    }
    
    public void SetFirstName(String FirstName)
    {
        firstName = FirstName;
    }
    
    public void SetLastName(String LastName)
    {
        lastName = LastName;
    }
    
    public void SetAccountType(String AccountType)
    {
        accountType = AccountType;
    }
    
    /*
    public void SetUsername(String Username)
    {
        username = Username;
    }
    */
    
    public void SetPassword(String Password)
    {
        password = Password;
    }
    
    public void SetEmailAddress(String EmailAddress)
    {
        emailAddress = EmailAddress;
    }
    
    public String GetFirstName()
    {
        return firstName;
    }
    
    public String GetLastName()
    {
        return lastName;
    }
    
    public String GetAccountType()
    {
        return accountType;
    }
    
    /*
    public String GetUsername()
    {
        return username;
    }
    */
    
    public String GetPassword()
    {
        return password;
    }
    
    public String GetEmailAddress()
    {
        return emailAddress;
    }
    
    public void UserTable()
    {
        feature.getUserTable();
    }
    
    public double accountBalance()
    {
        //do some calculations here
        return AccountBalance;
    }
}

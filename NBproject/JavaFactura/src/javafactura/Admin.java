package javafactura;
/**
 * Write a description of class Admin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Admin
{
    // instance variables - replace the example below with your own
    private String password;

    
    public Admin(String password){
        this.password = password;
    }
    
    public Admin(Admin adm){
        this.password=adm.getPassword();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String toString(){
        return ("Password: " + password);
    } 
    
     public boolean equals(Object o){
        if (this == o) 
            return true;
        
        if ((o==null) || (this.getClass() != o.getClass())) 
            return false;
        Admin adm = (Admin) o;
        return (this.password.equals(adm.getPassword())
                ) ;
        
    }
     public Admin clone(){
         return new Admin(this);
     }
     
}

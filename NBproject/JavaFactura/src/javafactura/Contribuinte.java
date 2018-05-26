package javafactura;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class Contribuinte here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Contribuinte implements Serializable
{
    int nif;
    private String email;
    private String nome;
    private String morada;
    private String password;
    private List<Integer> facturas;
   
    public Contribuinte(int nif, String email, String nome, String morada, String password){
        this.nif = nif;
        this.email= email;
        this.nome = nome;
        this.morada = morada;
        this.password = password;
        this.facturas = new ArrayList<Integer>();
        
    }
    
    public Contribuinte(Contribuinte c){
        this.nif = c.getNif();
        this.email= c.getEmail();
        this.nome = c.getNome();
        this.morada = c.getMorada();
        this.password = c.getPassword();
    }
    
    public List<Integer> getFacturas(){
        return this.facturas;
    }
    
    public void setFacturas(List<Integer> facturas){
        this.facturas= facturas;
    }
    
    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("NIF: "); sb.append(this.nif + "\n");
        sb.append("Email: "); sb.append(this.email+ "\n");
        sb.append("Nome: "); sb.append(this.nome + "\n");
        sb.append("Morada: ");sb.append(this.morada + "\n");
        sb.append("Password: "); sb.append (this.password);
        return sb.toString();
    }
    
    public boolean equals(Object o){
        if (this == o) 
            return true;
        
        if ((o==null) || (this.getClass() != o.getClass())) 
            return false;
        Contribuinte cont = (Contribuinte) o;
        return (this.nif == cont.getNif() && this.password.equals(cont.getPassword()) 
                && this.email.equals(cont.getEmail()) && this.nome.equals(cont.getNome()) 
                && this.morada.equals(cont.getMorada()));
    }
    public Contribuinte clone(){
         return new Contribuinte(this);
     }
}

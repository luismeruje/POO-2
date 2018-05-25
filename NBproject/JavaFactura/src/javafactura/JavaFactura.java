package javafactura;

import java.util.*;
/**
 * Write a description of class JavaFactura here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class JavaFactura
{
    private List<Contribuinte> contribuintes;
    private List<Factura> facturas;
    private Admin admin;

   
    public JavaFactura(Admin admin)
    {
    this.admin = admin;
    this.contribuintes = new ArrayList<Contribuinte>();
    this.facturas = new ArrayList<Factura>();
    }
    
    public JavaFactura(JavaFactura jf){
        this.admin = jf.getAdmin();
        this.contribuintes = jf.getContribuintes();
        this.facturas = jf.getFacturas();
    }
    
    public Admin getAdmin(){
        return this.admin;
    }
    
    public void setAdmin(Admin adm){
        this.admin = adm;
    }
    
    
    public List<Contribuinte> getContribuintes()  {
        return this.contribuintes;
    }
    
    public void setContribuintes(List<Factura> contribuinte){
        this.facturas = contribuinte;
    }
    
    public List<Factura> getFacturas()  {
        return this.facturas;
    }
    
    public void setFactura(List<Factura> factura){
        this.facturas = factura;
    }
    
    public List<Factura> getFacturasWithNIF(int NIF){
       List<Factura> facc = new ArrayList<Factura>();
       facturas.stream().filter((f) -> (f.getNifCliente() == NIF || f.getNifEmitente() == NIF )).forEach((f) -> {
           facc.add(f);
        });
       return facc;
    }
    
    public List<Factura> getFacturasPorConfirmar(int NIF){
       List<Factura> facc = new ArrayList<Factura>();
       facturas.stream().filter((f) -> (f.getNifCliente() == NIF && !f.getConfirmado())).forEach((f) -> {
           facc.add(f);
        });
       return facc;
    }
    
    
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Contribuintes:\n");
        for(Contribuinte cont: this.contribuintes){
            sb.append(cont.toString());
            sb.append("\n");
        }
        sb.append("Admin :\n"); sb.append(admin.toString());
        sb.append("Facturas:\n");
        for(Factura fac: this.facturas){
            sb.append(fac.toString());
            sb.append("\n");
        }
        
        return sb.toString();
    }
    
     public boolean equals(Object o){
        if (this == o) 
            return true;
        
        if ((o==null) || (this.getClass() != o.getClass())) 
            return false;
        JavaFactura jf = (JavaFactura) o;
        return (this.admin.equals(jf.getAdmin()) && this.contribuintes.equals(jf.getContribuintes())
                && this.facturas.equals(jf.getFacturas())
                );
        
    }
     
     public JavaFactura clone(){
         return new JavaFactura(this);
     }
   
}

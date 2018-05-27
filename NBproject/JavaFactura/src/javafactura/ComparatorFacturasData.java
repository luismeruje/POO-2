package javafactura;

import java.time.LocalDateTime;
import java.util.Comparator;


public class ComparatorFacturasData implements Comparator<Factura> {
    public int compare(Factura f1, Factura f2){
        LocalDateTime date1 = f1.getDataDespesa();
        LocalDateTime date2 = f2.getDataDespesa();
        return (date1.compareTo(date2));
    }
}

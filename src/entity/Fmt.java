/*------------------------------------------------------------------------------
 Fmt
------------------------------------------------------------------------------*/
package entity;

public class Fmt {
    
    public String NrDb(String cpfcnpj){  
        String valor = cpfcnpj.replaceAll("[./-]", "");
        
        return valor;
    }
}

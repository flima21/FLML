/*------------------------------------------------------------------------------
 Fmt
------------------------------------------------------------------------------*/
package entity;

public class Fmt {
    
    
    /** 
     * @param cpfcnpj
     * @return String
     */
    public String NrDb(String cpfcnpj){  
        String valor = cpfcnpj.replaceAll("[./-]", "");
        
        return valor;
    }
}

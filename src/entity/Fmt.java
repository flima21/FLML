/*------------------------------------------------------------------------------
 Fmt
------------------------------------------------------------------------------*/
package entity;

/**
 * @author Felipe Lima
 * @version 1.0
 * 
 * Classe para realizar formtaçãoes
 */
public class Fmt {
    
    
    /** 
     * @param cpfcnpj
     * @return String
     */
    public String NrDb(String cpfcnpj){  
        String valor = cpfcnpj.replaceAll("[./-]", ""); // Remove . / - [] por vázio
        
        return valor;
    }
}

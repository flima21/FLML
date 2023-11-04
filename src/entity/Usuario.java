package entity;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Usuario {
    
    private String login = null;
    private String senha = null;
    private String email = null;
    private String nome = null;
    
    
    
    /** 
     * Formata a senha em hashs
     * @param text byte[]
     * @return char[]
     */
    public static char[] hexCodes(byte[] text) {
        char[] hexOutput = new char[text.length * 2];
        String hexString;

        for (int i = 0; i < text.length; i++) {
            hexString = "00" + Integer.toHexString(text[i]);
            hexString.toUpperCase().getChars(hexString.length() - 2,
                                    hexString.length(), hexOutput, i * 2);
        }
        return hexOutput;
    }
    
    /**
     * Atribui a criptogragia
     * @return String 
     */
    public String setCriptografia(String new_pass) throws NoSuchAlgorithmException{
        MessageDigest md = MessageDigest.getInstance("MD5");
        String pass = new String(hexCodes(md.digest(new String(new_pass).getBytes())));
        
        return pass;
    }
    
    /**
     * Retorna login do usuario
     * @return String
     */
    public String getLogin(){
        return this.login;
    }
    
    /**
     * Atribui valor 
     * @return String
     */
    public void setLogin(String newValue){
        this.login = newValue;
    }
    
    /**
     * Captura a senha
     * @return String
     */
    public String getSenha(){
        return this.senha;
    }
    
    /**
     * Atribui a senha
     */
    public void setSenha(String newValue){
        this.senha = newValue;
    }
    
    /**
     * @return String
     */
    public String getEmail(){
        return this.email;
    }
    
    public void setEmail(String newValue){
        this.email = newValue;
    }
    
    /**
     * Retorna o nome 
     * @return String
     */
    public String getNome(){
        return this.nome;
    }
    
    /**
     * Atribui o nome
     * @return String
     */
    public void setNome(String newValue){
        this.nome = newValue;
    }
}

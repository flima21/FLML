package entity;

public class Status {
    private int id; // id do sistema
     
    private String cd_status; // codigo do status
    private String nm_status; // nome do status
    
    
    /** 
     * @return int
     */
    public int getId(){
        return this.id;
    }
    
    /** 
     * Atribui valor ao id
     */
    public void setId(int newValue){
        this.id = newValue;
    }
    
    /** 
     * @return String
     */
    public String getCdStatus(){
        return this.cd_status;
    }
    
    /** 
     * Atribui ao codigo
     */
    public void setCdStatus(String newValue){
        this.cd_status = newValue;
    }
    /** 
     * @return String
     */
    public String getNmStatus(){
        return this.nm_status;
    }
    
    /** 
     * Atribui nome do status
     */
    public void setNmStatus(String newValue){
        this.nm_status = newValue;
    }
}

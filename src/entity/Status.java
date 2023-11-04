package entity;

public class Status {
    private int id;
    
    private String cd_status;
    private String nm_status;
    
    
    /** 
     * @return int
     */
    public int getId(){
        return this.id;
    }
    
    public void setId(int newValue){
        this.id = newValue;
    }
    
    public String getCdStatus(){
        return this.cd_status;
    }
    
    public void setCdStatus(String newValue){
        this.cd_status = newValue;
    }
    
    public String getNmStatus(){
        return this.nm_status;
    }
    
    public void setNmStatus(String newValue){
        this.nm_status = newValue;
    }
}

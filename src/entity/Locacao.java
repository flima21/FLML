package entity;

/**
 *
 * @author Felipe Lima
 */
public class Locacao {
    private String nm_jogo;
    private String nm_cliente;
    private String nm_status;
    private String dt_locacao;
    private String dt_devolucao;
    
    private double vl_preco;
    
    
    /** 
     * @return String
     */
    public String getNmJogo(){
        return this.nm_jogo;
    }
    
    public void setNmJogo(String newValue){
        this.nm_jogo = newValue;
    }
    
    public String getNmCliente(){
        return this.nm_cliente;
    }
    
    public void setNmCliente(String newValue){
        this.nm_cliente = newValue;
    }
    
    public String getNmStatus(){
        return this.nm_status;
    }
    
    public void setNmStatus(String newValue){
        this.nm_status = newValue;
    }
    
    public String getDtLocacao(){
        return this.dt_locacao;
    }
    
    public void setDtLocacao(String newValue){
        this.dt_locacao = newValue;
    }
    
    public String getDtDevolucao(){
        return this.dt_devolucao;
    }
    
    public void setDtDevolucao(String newValue){
        this.dt_devolucao = newValue;
    }
}

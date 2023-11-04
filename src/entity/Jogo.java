package entity;

/**
 * @author Felipe Lima
 */
public class Jogo {
    private String cd_jogo;
    
    private String nm_genero;
    private String nm_disponibilidade;
    private String nm_titulo;
    private String ds_sinopse;
    private String path_img;

    private int nr_idade_minima;

    private double vl_preco;
    private double vl_quantidade;
    
    
    /** 
     * @return String
     */
    public String getCdJogo(){
        return this.cd_jogo;
    }
    
    public void setCdJogo(String newValue){
        this.cd_jogo = newValue;
    }
    
    public String getNmGenero(){
        return this.nm_genero;
    }
    
    public void setNmGenero(String newValue){
        this.nm_genero = newValue;
    }
    
    public String getNmDisponibilidade(){
        return this.nm_disponibilidade;
    }
    
    public void setNmDisponibilidade(String newValue){
        this.nm_disponibilidade = newValue;
    }
    
    public String getNmTitulo(){
        return this.nm_titulo;
    }
    
    public void setNmTitulo(String newValue){
        this.nm_titulo = newValue;
    }
    
    public String getDsSinopse(){
        return this.ds_sinopse;
    }
    
    public void setDsSinopse(String newValue){
        this.ds_sinopse = newValue;
    }
    
    public String getPathImg(){
        return this.path_img;
    }
    
    public void setPathImg(String newValue){
        this.path_img = newValue;
    }
    
    public int getNrIdadeMinima(){
        return this.nr_idade_minima;
    }
    
    public void setNrIdadeMinima(int newValue){
        this.nr_idade_minima = newValue;
    }
    
    public double getVlPreco(){
        return this.vl_preco;
    }
    
    public void setVlPreco(double newValue){
        this.vl_preco = newValue;
    }
    
    public double getVlQuantidade(){
        return this.vl_quantidade;
    }
    
    public void setVlQuantidade(double newValue){
        this.vl_quantidade = newValue;
    }
    
}

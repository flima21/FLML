package entity;

/**
 * @author Felipe Lima
 */
public class Jogo {
    private String cd_jogo; // codigo do jogo
    
    private String nm_genero; // genero do jogo
    private String nm_disponibilidade; // disponibilidade do jogo
    private String nm_titulo; // nome do jogo
    private String ds_sinopse; // sinopse do jogo
    private String path_img; // caminho da imagem do jogo

    private int nr_idade_minima;// idade minima do jogo

    private double vl_preco; // preço do jogo
    private double vl_quantidade; // quantidade
    
    
    /** 
     * Captura o codigo do jogo
     * @return String
     */
    public String getCdJogo(){
        return this.cd_jogo;
    }
    
    /** 
     * Atribui valor ao codigo
     */
    public void setCdJogo(String newValue){
        this.cd_jogo = newValue;
    }
    
    /** 
     * Captura o genero do jogo
     * @return String
     */
    public String getNmGenero(){
        return this.nm_genero;
    }
    
    /** 
     * Atribui valor ao genero
     */
    public void setNmGenero(String newValue){
        this.nm_genero = newValue;
    }
    
    /** 
     * Captura a disponibilidade do jogo
     * @return String
     */
    public String getNmDisponibilidade(){
        return this.nm_disponibilidade;
    }
    
    /** 
     * Atribui valor a disponilidade
     */
    public void setNmDisponibilidade(String newValue){
        this.nm_disponibilidade = newValue;
    }
    
    /** 
     * Captura o titulo do jogo
     * @return String
     */
    public String getNmTitulo(){
        return this.nm_titulo;
    }
    
    /** 
     * Atribui valor ao titulo
     */
    public void setNmTitulo(String newValue){
        this.nm_titulo = newValue;
    }
    
    /** 
     * Captura a sinopse do jogo
     * @return String
     */
    public String getDsSinopse(){
        return this.ds_sinopse;
    }
    
    /** 
     * Atribui valor a sinopse
     */
    public void setDsSinopse(String newValue){
        this.ds_sinopse = newValue;
    }
    
    /** 
     * Captura o caminho da imagem do jogo
     * @return String
     */
    public String getPathImg(){
        return this.path_img;
    }
    
    /** 
     * Atribui valor ao caminho da imagem
     */
    public void setPathImg(String newValue){
        this.path_img = newValue;
    }
    
    /** 
     * Captura a idade mina
     * @return String
     */
    public int getNrIdadeMinima(){
        return this.nr_idade_minima;
    }
    
    /** 
     * Atribui valor a idade minima
     */
    public void setNrIdadeMinima(int newValue){
        this.nr_idade_minima = newValue;
    }
    
    /** 
     * Captura o preço
     * @return String
     */
    public double getVlPreco(){
        return this.vl_preco;
    }
    
    /** 
     * Atribui valor ao preço
     */
    public void setVlPreco(double newValue){
        this.vl_preco = newValue;
    }
    
    /** 
     * Captura a quantidade
     * @return double
     */
    public double getVlQuantidade(){
        return this.vl_quantidade;
    }
    
    /** 
     * Atribui a quantidade
     */
    public void setVlQuantidade(double newValue){
        this.vl_quantidade = newValue;
    }
    
}

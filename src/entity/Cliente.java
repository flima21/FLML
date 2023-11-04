package entity;

/**
 * @author Felipe Lima
 * @version 1.0
 * 
 * Representação do cliente
 */
public class Cliente {

    private String nm_cliente; // Nome do cliente
    private String dt_nascimento; // Data de nascimento
    private String nm_email; // Email 
    private String nr_cpf; // CPF
    private String nr_cep; // CEP
    private String ds_logradouro; // Logradouro
    private String sg_estado; // Estado
    private String nm_cidade; // Cidade

    /**
     * Captura o nome do cliente
     * @return String
     */
    public String getNmCliente() {
        return this.nm_cliente;
    }

    /**
     * Atribui o nome do cliente
     */
    public void setNmCliente(String newValue) {
        this.nm_cliente = newValue;
    }

    /**
     * Captura a data de nascimento do cliente
     * @return String
     */
    public String getDtNascimento() {
        return this.dt_nascimento;
    }

    /**
     * Atribui a data de nasciento do cliente
     */
    public void setDtNascimento(String newValue) {
        this.dt_nascimento = newValue;
    }

    /**
     * Captura a email do cliente
     * @return String
     */
    public String getNmEmail() {
        return this.nm_email;
    }

    /**
     * Atribui o email do cliente
     */
    public void setNmEmail(String newValue) {
        this.nm_email = newValue;
    }

    /**
     * Captura O CPF OU CNPJ do cliente
     * @return String
     */
    public String getNrCpf() {
        return this.nr_cpf;
    }

    /**
     * Atribui o cpf do cliente
     */
    public void setNrCpf(String newValue) {
        Fmt format = new Fmt();

        this.nr_cpf = format.NrDb(newValue);
    }

    /**
     * Captura o CEP do cliente
     * @return String
     */
    public String getNrCep() {
        return this.nr_cep;
    }

    /**
     * Atribui o cep do cliente
     */
    public void setNrCep(String newValue) {
        Fmt format = new Fmt();

        this.nr_cep = format.NrDb(newValue);
    }
    
    /**
     * Captura o endereço do cliente
     * @return String
     */
    public String getDsLogradouro(){
        return this.ds_logradouro;
    }
    
    /**
     * Atribui o endereço do cliente
     */
    public void setDsLogradouro(String newValue){
        this.ds_logradouro = newValue;
    }
    
    /**
     * Captura o estado do cliente
     * @return String
     */
    public String getSgEstado(){
        return this.sg_estado;
    }
    
    /**
     * Atribui o estado do cliente
     */
    public void setSgEstado(String newValue){
        this.sg_estado = newValue;
    }
    
    /**
     * Captura a cidade do cliente
     * @return String
     */
    public String getNmCidade(){
        return this.nm_cidade;
    }
    
    /**
     * Atribui a cidade do cliente
     */
    public void setNmCidade(String newValue){
        this.nm_cidade = newValue;
    }
}

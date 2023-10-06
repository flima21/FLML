package entity;

/**
 * @author Felipe Lima
 */
public class Cliente {

    private String nm_cliente;
    private String dt_nascimento;
    private String nm_email;
    private String nr_cpf;
    private String nr_cep;
    private String ds_logradouro;
    private String sg_estado;
    private String nm_cidade;

    public String getNmCliente() {
        return this.nm_cliente;
    }

    public void setNmCliente(String newValue) {
        this.nm_cliente = newValue;
    }

    public String getDtNascimento() {
        return this.dt_nascimento;
    }

    public void setDtNascimento(String newValue) {
        this.dt_nascimento = newValue;
    }

    public String getNmEmail() {
        return this.nm_email;
    }

    public void setNmEmail(String newValue) {
        this.nm_email = newValue;
    }

    public String getNrCpf() {
        return this.nr_cpf;
    }

    public void setNrCpf(String newValue) {
        Fmt format = new Fmt();

        this.nr_cpf = format.NrDb(newValue);
    }

    public String getNrCep() {
        return this.nr_cep;
    }

    public void setNrCep(String newValue) {
        Fmt format = new Fmt();

        this.nr_cep = format.NrDb(newValue);
    }
    
    public String getDsLogradouro(){
        return this.ds_logradouro;
    }
    
    public void setDsLogradouro(String newValue){
        this.ds_logradouro = newValue;
    }
    
    public String getSgEstado(){
        return this.sg_estado;
    }
    
    public void setSgEstado(String newValue){
        this.sg_estado = newValue;
    }
    
    public String getNmCidade(){
        return this.nm_cidade;
    }
    
    public void setNmCidade(String newValue){
        this.nm_cidade = newValue;
    }
}

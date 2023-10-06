/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

public class Funcionario {
    private String tp_fj = null;
    private String nr_cpf_cnpj = null;
    private String nm_cliente = null;
    
    private int fg_ativo = 1;
    
    private String nm_email = null;
    private String nr_cep = null;
    private String ds_endereco = null;
    private String sg_estado = null;
    private String nm_municipio = null;
    
    public String getTpFj(){
        return this.tp_fj;
    }
    
    public void setTpFj(String newValue){
        this.tp_fj = newValue;
    }
    
    public String getNrCpfCnpj(){
        return this.nr_cpf_cnpj;
    }
    
    public void setNrCpfCnpj(String newValue){
        this.nr_cpf_cnpj = newValue;
    }
    
    public String getNmCliente(){
        return this.nm_cliente;
    }
    
    public void setNmCliente(String newValue){
        this.nm_cliente = newValue;
    }
    
    public int getFgAtivo(){
        return this.fg_ativo;
    }
    
    public void setFgAtivo(int newValue){
        this.fg_ativo = newValue;
    }
    
    public String getNmEmail(){
        return this.nm_email;
    }
    
    public void setNmEmail(String newValue){
        this.nm_email = newValue;
    }
    
    public String getNrCep(){
        return this.nr_cep;
    }
    
    public void setNrCep(String newValue){
        this.nr_cep = newValue;
    }
    
    public String getDsEndereco(){
        return this.ds_endereco;
    }
    
    public void setDsEndereco(String newValue){
        this.ds_endereco = newValue;
    }
    
    public String getSgEstado(){
        return this.sg_estado;
    }
    
    public void setSgEstado(String newValue){
        this.sg_estado = newValue;
    }
    
    public String getNmMunicipio(){
        return this.nm_municipio;
    }
    
    public void setNmMunicipio(String newValue){
        this.nm_municipio = newValue;
    }
}

package Projects.Java.POO;

import java.sql.Date;

public class Venda {
    //Aqui podemos ver a aplicação do encapsulamento de maneira mais prática:
    //Reduzindo a visibilidade de alguns atributos para private e trabalhando com eles a partir de métodos get e set;
    private Pessoa vendedor;
    private Carro produto;
    private Cliente comprador;
    public Date data_venda;
    public float valor_venda;

    public Pessoa getVendedor(){
        return vendedor;
    }

    public void setVendedor(Pessoa vendedor)
    {
        this.vendedor = vendedor;
    }

    public Carro getProduto(){
        return produto;
    }

    public void setProduto(Carro produto)
    {
        this.produto = produto;
    }

    public Cliente getComprador(){
        return comprador;
    }

    public void setComprador(Cliente comprador){
        this.comprador = comprador;
    }

    public void vender(){

    }

    public void cancelarVenda(){
        
    }

}

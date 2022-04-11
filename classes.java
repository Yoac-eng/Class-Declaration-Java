package Projects.Java.POO;

/* ALUNO: CAYO RICARDO MILHOMEM DE S. CUTRIM
   Onde são aplicados os 4 paradigmas da programação orientadas a objetos nesse código?
*/
public class classes {
    public static void main(String[] args) {
        
        Pessoa Vendedor1 = new Pessoa();
        Cliente Cliente1 = new Cliente();
        Carro Carro1 = new Carro();
        Venda Venda1 = new Venda();
        
        Vendedor1.nome = "Cleber";
        Cliente1.nome = "Robert";
        Carro1.modelo = "Gol";
        Venda1.setComprador(Cliente1);
        Venda1.setProduto(Carro1);
        Venda1.setVendedor(Vendedor1);
        Venda1.getComprador();
        Venda1.getProduto();
        Venda1.getVendedor();
    }
}
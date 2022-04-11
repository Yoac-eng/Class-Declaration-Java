package Projects.Java.POO;

import java.sql.Date;

// Aqui podemos ver o paradigma da abstração:
public class Pessoa {
    //Aqui podemos ver o paradigma do encapsulamento:
    public String nome;
    public int cpf;
    public int rg;
    public Date data_nasc;
    public int sexo;

    public static void falar(){
        System.out.print("Bom dia, gostaria de obter informações sobre esse carro.");
    }

}

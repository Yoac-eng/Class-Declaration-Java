package Projects.Java.POO;

// Aqui podemos ver o paradigma da abstração e hierarquia:
public class Cliente extends Pessoa{
    //Aqui podemos ver o paradigma do encapsulamento:
    //pois definimos o código como public, portanto estando "escondido" mas acessível pro resto do programa;
    public String comprov_Res;

    public static void comprarCarro(String modelo){

    }

    //Aqui podemos ver o paradigma do polimorfismo:
    //Pois o método falar existe na classe pessoa de quem a classe cliente herda mas 
    //na classe Cliente ela se comporta de maneira diferente por mais que seja o mesmo método;
    public static void falar(){
        System.out.print("Ok, então irei fazer a compra.");
    }
}

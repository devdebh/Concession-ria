import java.util.Scanner;

public class Carro {
    String marca;
    String modelo;
    int anoFabricacao;

    public Carro(String marcaCarro, String modeloCarro, int anoDoCarro) {
    this.marca = marcaCarro;
    this.modelo = modeloCarro;
    this.anoFabricacao = anoDoCarro;
    // Construtor
    // O construtor é um método especial que é chamado automaticamente toda vez que é criado um novo objeto da classe em que ele está
    // Construtor = public Carro (String marcaCarro, String modeloCarro, int anoCarro) + this
    // Construtor = public NomeDaClasse (tipo nomeAtributo, tipo nomeAtributo...) + this
    }
    public String obterDescricao(){
        return "Marca: " + this.marca + ", modelo: " + this.modelo + ", ano de fabricação: " + this.anoFabricacao;
    }


   /* static void obterDescricao(){ //método
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite a marca do seu carro: ");
        String marca = scanner.nextLine();
        System.out.println("Digite o modelo do seu carro: ");
        String modelo = scanner.nextLine();
        System.out.println("Por fim, digite seu ano de fabricação: ");
        int anoFabricação = scanner.nextInt();
        scanner.nextLine();

    }*/
}

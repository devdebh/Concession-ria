public class Main {
    public static void main (String[] args) {
        Carro primeiroCarro = new Carro ("Honda","Civic G10",2019);
        Carro segundoCarro = new Carro ("Hiundai", "HB20 flex", 2010);
        Carro terceiroCarro = new Carro("Toyota","Corolla xei",2018);
        Carro quartoCarro = new Carro ("Pegeut", "207",2004);
        String descricaoPrimeiroCarro = primeiroCarro.obterDescricao();
        String descricaoSegundoCarro = segundoCarro.obterDescricao();
        String descricaoTerceiroCarro = terceiroCarro.obterDescricao();
        String descricaoQuartoCarro = quartoCarro.obterDescricao();

        System.out.println("Detalhes referentes ao primeiro carro: " + descricaoPrimeiroCarro);
        System.out.println("Detalhes referentes ao segundo carro: " + descricaoSegundoCarro);
        System.out.println("Detalhes referentes ao terceiro carro: " + descricaoTerceiroCarro);
        System.out.println("Detalhes referentes ao quarto carro: " + descricaoQuartoCarro);
    }

}
public class Iphone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical {
    public static void main(String[] args) throws Exception {

       
        // Reprodutor de musica
        System.out.println("Reprodutor de musica");

        ReprodutorMusical.tocar();
        ReprodutorMusical.pausar();

        System.out.println("--------------------------------------");

        // Acessar a internet
        System.out.println("Acessar a internet");
        NavegadorInternet.acessar("pricillateixeira.free.nf");

        System.out.println("--------------------------------------");

        // Chamadas
        System.out.println("Aparelho Telefônico");
        AparelhoTelefonico.ligar("61999999999");
        AparelhoTelefonico.desligar();

    }
}

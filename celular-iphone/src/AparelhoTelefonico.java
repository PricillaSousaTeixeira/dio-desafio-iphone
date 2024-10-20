public interface AparelhoTelefonico {

    public static void ligar(String numero){
        System.out.println("Ligando para o número: "+ numero);
    }

    public static void desligar(){
        System.out.println("Chamada encerrada");
    }
}

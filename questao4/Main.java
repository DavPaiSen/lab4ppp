package questao4;

public class Main {
    public static void main(String[] args) {
        CarroFacade carroFacade = new CarroFacade(new Cinto(), new Farol(), new Motor(), new Porta(), new Radio());

        carroFacade.comecaCorrida("radio legal");

        System.out.println("\n\n\n\n");

        carroFacade.terminaCorrida();
    }
}

package questao4;

public class CarroFacade {
    private Cinto cinto;
    private Farol farol;
    private Motor motor;
    private Porta porta;
    private Radio radio;


    public CarroFacade(Cinto cinto, Farol farol, Motor motor, Porta porta, Radio radio) {
        this.cinto = cinto;
        this.farol = farol;
        this.motor = motor;
        this.porta = porta;
        this.radio = radio;
    }

    public void comecaCorrida(String estacao) {
        motor.ligar();
        porta.trancar();
        cinto.botar();
        farol.ligar();
        radio.ligar();
        radio.sintonizar(estacao);   
    }

    public void terminaCorrida() {
        motor.desligar();
        porta.destrancar();
        cinto.tirar();
        farol.desligar();
        radio.desligar();
    }
}

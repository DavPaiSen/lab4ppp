package questao2;

public class BebidaDecorator implements Bebida{
    protected Bebida bebida;

    public BebidaDecorator(Bebida bebida) {
        this.bebida = bebida;
    }

    public float calculaCusto() {
        return bebida.calculaCusto();
    }

    public String getDescricao() {
        return (bebida.getDescricao());
    }
}

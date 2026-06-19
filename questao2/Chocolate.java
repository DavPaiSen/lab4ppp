package questao2;

public class Chocolate extends BebidaDecorator{
    public Chocolate (Bebida bebida) {
        super(bebida);
    }

    @Override
    public float calculaCusto() {
        return super.calculaCusto() + (float)3;
    }

    @Override
    public String getDescricao() {
        return (super.getDescricao() + "chocolate, ");
    }
}

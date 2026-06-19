package questao2;

public class Canela extends BebidaDecorator{
    public Canela(Bebida bebida) {
        super(bebida);
    }

    @Override
    public float calculaCusto() {
        return super.calculaCusto() + (float) 2;
    }

    @Override
    public String getDescricao() {
        return (super.getDescricao() + "canela, ");
    }
}

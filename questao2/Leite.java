package questao2;

public class Leite extends BebidaDecorator{
    public Leite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public float calculaCusto() {
        return super.calculaCusto() + (float)2;
    }

    @Override
    public String getDescricao() {
        return (super.getDescricao() + "leite, ");
    }
}

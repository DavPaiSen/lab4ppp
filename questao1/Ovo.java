public class Ovo extends PizzaDecorator{
    @Override
    public String getDescricao() {
        return (super.getDescricao() + ", ovo");
    }

    @Override
    public double getPreco() {
        return (super.getPreco() + 3.0);
    }

    public Ovo(Pizza pizza) {
        super(pizza);
    }
}

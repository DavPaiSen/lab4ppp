public class Queijo extends PizzaDecorator{
    @Override
    public String getDescricao() {
        return (super.getDescricao() + ", queijo");
    }

    @Override
    public double getPreco() {
        return (super.getPreco() + 5.0);
    }

    public Queijo(Pizza pizza) {
        super(pizza);
    }
}

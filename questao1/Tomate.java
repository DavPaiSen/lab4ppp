public class Tomate extends PizzaDecorator{

    public Tomate(Pizza pizza) {
        super(pizza);
    }
    
    @Override
    public String getDescricao() {
        return (super.getDescricao() + ", tomate");
    }

    @Override
    public double getPreco() {
        return (super.getPreco() + 2.0);
    }
}

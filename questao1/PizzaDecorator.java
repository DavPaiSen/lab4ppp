public class PizzaDecorator implements Pizza{
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescricao() {
        return pizza.getDescricao();
    }

    public double getPreco() {
        return pizza.getPreco();
    }
}
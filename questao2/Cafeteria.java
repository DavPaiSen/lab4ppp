package questao2;

public class Cafeteria {
    public static void main(String[] args) {
        Bebida xtudo = new Chocolate(new Canela(new Leite(new Espresso())));
        Bebida xtudoDecaf = new Chocolate(new Canela(new Leite(new Decaf())));
        Bebida cafeComLeite = new Leite(new Espresso());
        System.out.println("Xtudo:\nPreco: " + xtudo.calculaCusto() + "\nDescricao: " + xtudo.getDescricao() + "\n");
        System.out.println("Xtudo decaf:\nPreco: " + xtudoDecaf.calculaCusto() + "\nDescricao: " + xtudoDecaf.getDescricao() + "\n");
        System.out.println("Cafe com leite:\nPreco: " + cafeComLeite.calculaCusto() + "\nDescricao: " + cafeComLeite.getDescricao() + "\n");
    }
}

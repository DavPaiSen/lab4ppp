public class Pizzaria {
    public static void main(String[] args) {
        Pizza marguerita = new Queijo(new Tomate(new MassaFinaPizza()));
        System.out.println(marguerita.getDescricao());
        System.out.println(marguerita.getPreco());
        Pizza portuguesa = new Queijo(new Ovo(new Tomate(new MassaExpessaPizza())));
        System.out.println(portuguesa.getDescricao());
        System.out.println(portuguesa.getPreco());
    }
}

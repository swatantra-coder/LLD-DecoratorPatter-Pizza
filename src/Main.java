public class Main {
    public static void main(String[] args) {
        Pizza plainPizza = new PlainPizza();
        System.out.println(plainPizza.description());
        plainPizza = new CheesePizzaDecorator(plainPizza);
        System.out.println(plainPizza.description()+" "+plainPizza.cost());
    }
}
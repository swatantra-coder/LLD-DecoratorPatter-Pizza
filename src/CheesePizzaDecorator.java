public class CheesePizzaDecorator extends PizzaDecorator{
    public CheesePizzaDecorator(Pizza pizza){
        super(pizza);
    }
    @Override
    public String description(){
        return pizza.description() + " with cheese";
    }
    @Override
    public double cost(){
        return pizza.cost() + 120.0;
    }
}

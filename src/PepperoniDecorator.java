public class PepperoniDecorator extends PizzaDecorator{
    public PepperoniDecorator(Pizza pizza){
        super(pizza);
    }
    @Override
    public String description(){
        return pizza.description() + " pepperoni";
    }
    @Override
    public double cost(){
        return pizza.cost() + 100.0;
    }
}

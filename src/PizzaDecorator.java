public class PizzaDecorator implements Pizza{
    protected Pizza pizza;
    public PizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public String description(){
        return pizza.description();
    }

    @Override
    public double cost(){
        return pizza.cost();
    }
}

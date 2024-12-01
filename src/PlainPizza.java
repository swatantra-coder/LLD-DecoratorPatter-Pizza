public class PlainPizza implements Pizza{
    @Override
    public String description(){
        return "Pizza";
    }

    @Override
    public double cost(){
        return 50;
    }
}

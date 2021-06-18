package musicShop;

public class Customer {

    private final String name;
    private final int cash;

    public Customer(String name, int cash){
        this.name = name;
        this.cash = cash;
    }

    public String getName(){
        return name;
    }

    public int getCash(){
        return cash;
    }
}

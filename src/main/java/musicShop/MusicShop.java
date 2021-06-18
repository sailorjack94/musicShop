package musicShop;

import behaviours.ISell;
import instruments.Instrument;

import java.util.ArrayList;
import java.util.HashMap;

public class MusicShop {

    String name;
    ArrayList<ISell> stock = new ArrayList<>();
    int till;

    public MusicShop(String name, ArrayList<ISell> stock, int till){
        this.name = name;
        this.stock = stock;
        this.till = till;
    }
    public String getName(){
        return name;
    }

    public int getTill(){
        return till;
    }

    public ArrayList<ISell> getStock(){
        return stock;
    }

    public void addStock(Instrument instrument) {
        stock.add(instrument);
    }

    public boolean stockCheck(Instrument instrument){
        return stock.contains(instrument);
    }

    public void removeStock(Instrument instrument) {
        if (stockCheck(instrument)){
            stock.remove(instrument);
        }
    }
}

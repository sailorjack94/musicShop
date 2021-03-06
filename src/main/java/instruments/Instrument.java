package instruments;


import behaviours.ISell;

public abstract class Instrument implements ISell {

    private final String family;
    private final int wholesalePrice;
    private final int sellPrice;

    public Instrument(String family, int wholesalePrice, int sellPrice){
        this.family = family;
        this.wholesalePrice = wholesalePrice;
        this.sellPrice = sellPrice;

    }

    public String getFamily(){
        return family;
    }

    public int getWholesalePrice(){
        return wholesalePrice;
    }

    public int getSellPrice(){
        return sellPrice;
    }

    public int calculateMarkup(){
        return getSellPrice() - getWholesalePrice();
    }
}

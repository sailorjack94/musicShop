package instruments.whistles;

import behaviours.IPlay;
import enums.KeyTypes;

public class HighWhistle extends WhistleInstrument implements IPlay {

    private final KeyTypes key;

    public HighWhistle(String family, int wholesalePrice, int sellPrice, String body, String style, KeyTypes key){
        super(family, wholesalePrice, sellPrice, body, style);
        this.key = key;
    }

    public KeyTypes getKey(){
        return key;
    }

    public String playMe(){
        return "Shrill and whistle-y.";
    }
}

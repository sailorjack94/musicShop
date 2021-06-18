package instruments.whistles;

import enums.KeyTypes;

public class HighWhistle extends WhistleInstrument{

    private final KeyTypes key;

    public HighWhistle(String family, int wholesalePrice, int sellPrice, String body, String style, KeyTypes key){
        super(family, wholesalePrice, sellPrice, body, style);
        this.key = key;
    }

    public KeyTypes getKey(){
        return key;
    }
}

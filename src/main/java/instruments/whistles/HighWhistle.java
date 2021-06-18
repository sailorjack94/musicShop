package instruments.whistles;

import enums.KeyTypes;

public class HighWhistle extends WhistleInstrument{

    private final KeyTypes key;

    public HighWhistle(String family, String body, String style, KeyTypes key){
        super(family, body, style);
        this.key = key;
    }

    public KeyTypes getKey(){
        return key;
    }
}

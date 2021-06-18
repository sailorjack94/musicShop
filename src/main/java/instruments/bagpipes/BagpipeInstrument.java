package instruments.bagpipes;

import enums.KeyTypes;
import instruments.Instrument;

public abstract class BagpipeInstrument extends Instrument {

    private final String style;
    private final KeyTypes key;

    public BagpipeInstrument(String family, int wholesalePrice, int sellPrice, String style, KeyTypes key){
        super(family, wholesalePrice, sellPrice);
        this.style = style;
        this.key = key;
    }

    public String getStyle(){
        return style;
    }

    public KeyTypes getKey(){
        return key;
    }
}

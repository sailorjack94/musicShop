package instruments.strings;

import instruments.Instrument;

public abstract class StringedInstrument extends Instrument {

    private final int strings;
    private final String body;
    private final String style;

    public StringedInstrument(String family, int wholesalePrice, int sellPrice, String style, int strings, String body){
        super(family, wholesalePrice, sellPrice);
        this.style = style;
        this.strings = strings;
        this.body = body;
    }

    public String getStyle(){
        return style;

    }
    public int getStrings(){
        return strings;
    }

    public String getBody(){
        return body;
    }
}

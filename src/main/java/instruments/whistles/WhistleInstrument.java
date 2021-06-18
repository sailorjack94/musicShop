package instruments.whistles;

import instruments.Instrument;

public abstract class WhistleInstrument extends Instrument {

    private final String body;
    private final String style;

    public WhistleInstrument(String family, int wholesalePrice, int sellPrice, String body, String style){
        super(family, wholesalePrice, sellPrice);
        this.body = body;
        this.style = style;
    }

    public String getBody() {
        return body;
    }

    public String getStyle() {
        return style;
    }
}

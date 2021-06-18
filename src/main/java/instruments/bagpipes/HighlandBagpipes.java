package instruments.bagpipes;

import enums.KeyTypes;

public class HighlandBagpipes extends BagpipeInstrument{

    private final String family;
    private final String style;
    private final KeyTypes key;

    public HighlandBagpipes(String family, String style, KeyTypes key){
        super(family, style, key);
        this.family = "Bagpipes";
        this.style = "Highland";
        this.key = KeyTypes.BFLAT;
    }

    @Override
    public String getFamily() {
        return family;
    }

    @Override
    public String getStyle() {
        return style;
    }

    @Override
    public KeyTypes getKey() {
        return key;
    }
}

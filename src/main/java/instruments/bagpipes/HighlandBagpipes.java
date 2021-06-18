package instruments.bagpipes;

import behaviours.IPlay;
import enums.KeyTypes;
import instruments.Instrument;

public class HighlandBagpipes extends BagpipeInstrument implements IPlay {

    private final String material;

    public HighlandBagpipes(String family, int wholesalePrice, int sellPrice, String style, KeyTypes key, String material){
        super(family, wholesalePrice, sellPrice, style, key);
        this.material = material;
    }

    public String getMaterial(){
        return material;
    }

    @Override
    public String playMe() {
        return "A roaring skirl.";
    }
}

package instruments.bagpipes;

import enums.KeyTypes;

public class HighlandBagpipes extends BagpipeInstrument{

    private final String material;

    public HighlandBagpipes(String family, int wholesalePrice, int sellPrice, String style, KeyTypes key, String material){
        super(family, wholesalePrice, sellPrice, style, key);
        this.material = material;
    }

    public String getMaterial(){
        return material;
    }

}

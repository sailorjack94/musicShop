package instruments.bagpipes;

import enums.KeyTypes;

public class HighlandBagpipes extends BagpipeInstrument{

    private final String material;

    public HighlandBagpipes(String family, String style, KeyTypes key, String material){
        super(family, style, key);
        this.material = material;
    }

    public String getMaterial(){
        return material;
    }

}

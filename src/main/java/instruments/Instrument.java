package instruments;

import enums.KeyTypes;

import java.security.Key;

public abstract class Instrument {

    private final String family;

    public Instrument(String family){
        this.family = family;

    }

    public String getFamily(){
        return family;
    }
}

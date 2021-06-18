package instruments.strings;

public class AcousticGuitar extends StringedInstrument{

    private final String manufacturer;

    public AcousticGuitar(String family, int wholesalePrice, int sellPrice, String style, int strings, String body, String manufacturer){
        super(family, wholesalePrice, sellPrice, style, strings, body);
        this.manufacturer = manufacturer;

    }

    public String getManufacturer(){
        return manufacturer;
    }

}

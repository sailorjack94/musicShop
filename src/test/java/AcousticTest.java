import enums.KeyTypes;
import instruments.strings.AcousticGuitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AcousticTest {

    AcousticGuitar guitar;


    @Before
    public void before(){
        guitar = new AcousticGuitar("Guitar", 250, 315, "Electro-Acoustic", 6, "Hollow", "Fishman");
    }

    @Test
    public void hasFamily() {
        assertEquals("Guitar", guitar.getFamily());
    }

    @Test
    public void hasStyle() {
        assertEquals("Electro-Acoustic", guitar.getStyle());
    }

    @Test
    public void hasStrings() {
        assertEquals(6, guitar.getStrings());
    }

    @Test
    public void hasBody(){
        assertEquals("Hollow", guitar.getBody());
    }

    @Test
    public void hasManufacturer(){
        assertEquals("Fishman", guitar.getManufacturer());
    }

    @Test
    public void hasWholesalePrice(){
        assertEquals(250, guitar.getWholesalePrice());
    }
    @Test
    public void hasSellPrice(){
        assertEquals(315, guitar.getSellPrice());
    }
    @Test
    public void canPlay(){
        assertEquals("Soft strumming.", guitar.playMe());
    }
}

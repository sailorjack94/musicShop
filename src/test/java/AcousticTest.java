import enums.KeyTypes;
import instruments.strings.AcousticGuitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AcousticTest {

    AcousticGuitar guitar;


    @Before
    public void before(){
        guitar = new AcousticGuitar("Guitar", "Electro-Acoustic", 6, "Hollow", "Fishman");
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
}

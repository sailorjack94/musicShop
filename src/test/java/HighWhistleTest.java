import enums.KeyTypes;
import instruments.strings.AcousticGuitar;
import instruments.whistles.HighWhistle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HighWhistleTest {

    HighWhistle whistle;


    @Before
    public void before(){
        whistle = new HighWhistle("Whistle", 45, 70, "Aluminium", "High", KeyTypes.D);
    }

    @Test
    public void hasFamily() {
        assertEquals("Whistle", whistle.getFamily());
    }

    @Test
    public void hasStyle() {
        assertEquals("High", whistle.getStyle());
    }

    @Test
    public void hasBody(){
        assertEquals("Aluminium", whistle.getBody());
    }

    @Test
    public void hasKey(){
        assertEquals(KeyTypes.D, whistle.getKey());
    }

    @Test
    public void hasWholesalePrice(){
        assertEquals(45, whistle.getWholesalePrice());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(70, whistle.getSellPrice());
    }

    @Test
    public void canPlay(){
        assertEquals("Shrill and whistle-y.", whistle.playMe());
    }
}

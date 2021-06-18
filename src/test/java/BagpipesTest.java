import enums.KeyTypes;
import instruments.bagpipes.HighlandBagpipes;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class BagpipesTest {


    HighlandBagpipes pipes;

    @Before
    public void before(){
        pipes = new HighlandBagpipes("Bagpipes", 800, 1200, "Highland", KeyTypes.BFLAT, "Mahogany");
    }

    @Test
    public void pipesHaveFamily() {
        assertEquals("Bagpipes", pipes.getFamily());
    }

    @Test
    public void pipesHaveStyle() {
        assertEquals("Highland", pipes.getStyle());
    }

    @Test
    public void pipesHaveKey() {
        assertEquals(KeyTypes.BFLAT, pipes.getKey());
    }

    @Test
    public void pipesHaveMaterial(){
        assertEquals("Mahogany", pipes.getMaterial());
    }

    @Test
    public void hasWholesalePrice(){
        assertEquals(800, pipes.getWholesalePrice());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(1200, pipes.getSellPrice());
    }

    @Test
    public void canPlay(){
        assertEquals("A roaring skirl.", pipes.playMe());
    }

    @Test
    public void canGetMarkup(){
        assertEquals(400, pipes.calculateMarkup());
    }
}

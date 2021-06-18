import enums.KeyTypes;
import instruments.bagpipes.HighlandBagpipes;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class BagpipesTest {


    HighlandBagpipes pipes;

    @Before
    public void before(){
        pipes = new HighlandBagpipes("Bagpipes", "Highland", KeyTypes.BFLAT);
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
}

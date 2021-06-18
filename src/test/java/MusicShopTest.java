import behaviours.ISell;
import enums.KeyTypes;
import instruments.bagpipes.HighlandBagpipes;
import instruments.whistles.HighWhistle;
import musicShop.Customer;
import musicShop.MusicShop;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {

    MusicShop shop;
    HighWhistle whistle;
    Customer customer;
    ArrayList<ISell> stock;
    HighlandBagpipes pipes;

    @Before
    public void before(){
        stock = new ArrayList<>();
        shop = new MusicShop("CodeClan Music Supplies", stock, 2500);
        customer = new Customer("Niall", 150);
        whistle = new HighWhistle("Whistle", 45, 70, "Aluminium", "High", KeyTypes.D);
        pipes = new HighlandBagpipes("Bagpipes", 800, 1200, "Highland", KeyTypes.BFLAT, "Mahogany");
    }

    @Test
    public void shopHasName(){
        assertEquals("CodeClan Music Supplies", shop.getName());
    }

    @Test
    public void shopStartsEmpty(){
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void shopHasTill(){
        assertEquals(2500, shop.getTill());
    }

    @Test
    public void canAddToShop(){
        shop.addStock(whistle);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canRemoveStock(){
        shop.addStock(whistle);
        shop.addStock(whistle);
        shop.removeStock(whistle);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void unableToRemoveStockNotPresent(){
        shop.addStock(whistle);
        shop.removeStock(pipes);
        assertEquals(1, shop.getStock().size());

    }

    @Test
    public void testTotalProfitCalc(){
        shop.addStock(whistle);
        shop.addStock(whistle);
        shop.addStock(whistle);
        assertEquals(75, shop.totalProfitInStock());
    }
}

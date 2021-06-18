package behaviours;

import instruments.Instrument;
import musicShop.Customer;

public interface ISell {

    public void sell(Instrument instrument, Customer customer);
    public int calculateMarkup(Instrument instrument);

}

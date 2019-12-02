import instruments.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Bass bass;


    @Before
    public void before(){
        shop = new Shop();
        bass = new Bass("Marcus Miller", "V7 Swamp Ahs-4", 400, 2000, "Jazz Bass");
    }

    @Test
    public void shopStockStartsEmpty() {
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void itemsCanBeAddedToShop() {
        shop.addItemToStock(bass);
        assertEquals(1, shop.getStockCount());
    }

    @Test
    public void canRemoveItemIfPresentInStock() {
        shop.addItemToStock(bass);
        shop.addItemToStock(bass);
        assertEquals(2, shop.getStockCount());
    }

    @Test
    public void removeItemReturnsRequestedItem() {
        shop.addItemToStock(bass);
        assertEquals(bass, shop.removeItemFromStock(bass));
    }
}

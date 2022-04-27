package simplefactory;

import org.junit.Test;

import static org.junit.Assert.*;

public class HotPotStoreTest {

    @Test
    public void orderHotPot() {
        HotPotStore hotPotStore = new HotPotStore(new HotPotFactory());
        hotPotStore.orderHotPot(HotPotFactory.ONE_TYPE);
        hotPotStore.orderHotPot(HotPotFactory.TW0_TYPE);
    }
}
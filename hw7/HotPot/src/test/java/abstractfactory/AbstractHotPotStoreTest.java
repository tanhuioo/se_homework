package abstractfactory;
import org.junit.Test;

public class AbstractHotPotStoreTest {
    @Test
    public void test1() {
        AbHotPotStore hotPotStore = new OneHotPotStore();
        hotPotStore.orderHotPot();
        AbHotPotStore hotPotStore2 = new TwoHotPotStore();
        hotPotStore2.orderHotPot();
    }

}
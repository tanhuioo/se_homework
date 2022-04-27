package abstractfactory;

public class TwoHotPotStore extends AbHotPotStore {
    @Override
    public HotPot createHotPot() {
        return new TwoHotPot();
    }
}

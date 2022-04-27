package abstractfactory;

public class OneHotPotStore extends AbHotPotStore {
    @Override
    public HotPot createHotPot() {
        return new OneHotPot();
    }

}

package abstractfactory;

public class TwoHotPot extends HotPot{
    public TwoHotPot() {
        this.meat = "twoMeat";
        this.greens = "twoGreens";
        this.material = "twoMaterial";
    }

    /*
    每类火锅需要哪些肉，菜，底料等。
     */
    @Override
    public String prepare() {
        return this.getClass() + "prepare----------";
    }

}

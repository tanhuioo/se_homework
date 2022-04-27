package simplefactory;

public class OneHotPot extends HotPot{
    public OneHotPot() {
        this.meat = "oneMeat";
        this.greens = "oneGreens";
        this.material = "oneMaterial";
    }


    //每类火锅需要哪些肉，菜，底料等。
    public String prepare() {
        return this.getClass() + "prepare----------";
    }
}

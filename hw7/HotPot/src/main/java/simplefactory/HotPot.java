package simplefactory;

public abstract class HotPot {

    //肉
    protected String meat;

     //菜
    protected String greens;

     //底料
    protected String material;

    //每类火锅需要哪些肉，菜，底料等。
    public abstract String prepare();

    // 区分不同对象
    public void display() {
        System.out.println(this.meat + this.greens + this.material);
    }
}

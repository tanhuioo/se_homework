package abstractfactory;

public abstract class AbHotPotStore {
    public void orderHotPot() {
        /*
         调用具体创建者
         */
        HotPot hotPot = this.createHotPot();
        hotPot.prepare();
        hotPot.display();
    }

    /*
     抽象创建火锅对象
     */
    public abstract HotPot createHotPot();
}

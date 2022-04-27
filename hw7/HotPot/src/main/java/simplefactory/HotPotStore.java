package simplefactory;

public class HotPotStore {
    //商店

    // 组合工厂对象
    private HotPotFactory hotPotFactory;

    //初始化工厂对象
    public HotPotStore(HotPotFactory hotPotFactory) {
        this.hotPotFactory = hotPotFactory;
    }

    //暴露订单
    public void orderHotPot(int type) {
        HotPot hotPot = this.hotPotFactory.createHotPot(type);
        hotPot.prepare();
        hotPot.display();
    }
}

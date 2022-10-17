package factory.abstraction.common;

/**
 * @author：TianLong
 * @date：2022/10/13 18:55
 * @detail：具体实现产品，华为汽车
 */
class HWCar extends HWProduct {
    @Override
    void brand() {
        System.out.println("华为汽车");
    }

    void driver(){
        System.out.println("我在开华为汽车");
    }
}

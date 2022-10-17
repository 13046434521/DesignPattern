package factory.abstraction.common;

/**
 * @author：TianLong
 * @date：2022/10/13 19:01
 * @detail：具体实现产品，苹果手机
 */
class Iphone extends AppleProduct {
    @Override
    void brand() {
        System.out.println("IPhone 14 Pro Max");
    }

    void call(){
        System.out.println("IPhone打电话信号太差");
    }
}

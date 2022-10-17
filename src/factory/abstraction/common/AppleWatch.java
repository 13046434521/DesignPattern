package factory.abstraction.common;

/**
 * @author：TianLong
 * @date：2022/10/13 19:01
 * @detail：具体实现产品，苹果手表
 */
class AppleWatch extends AppleProduct {
    @Override
    void brand() {
        System.out.println("Apple Watch Series 8");
    }

    void watch() {
        System.out.println("苹果手表已经出到Series 8了");
    }
}

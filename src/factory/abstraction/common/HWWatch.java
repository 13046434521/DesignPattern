package factory.abstraction.common;

/**
 * @author：TianLong
 * @date：2022/10/13 18:55
 * @detail：具体抽象产品，华为手表
 */
class HWWatch extends HWProduct {

    void watch() {
        System.out.println("华为的手表很时尚");
    }

    @Override
    void brand() {
        System.out.println("华为手表");
    }
}

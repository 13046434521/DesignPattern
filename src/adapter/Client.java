package adapter;

/**
 * @author：TianLong
 * @date：2022/10/19 17:28
 * @detail：客户端类
 */
class Client {
    public static void main(String[] args) {
        // 通过适配器，将Lighting转换成USB接口
        IPhone14Pro iPhone14Pro = new IPhone14Pro();
        IphoneAdapter iphoneAdapter = new IphoneAdapter();
        iphoneAdapter.setAdapter(iPhone14Pro);
        System.out.println(iphoneAdapter.USB());

        // 通过适配器，将typeC转换成USB
        HwMate50Pro hwMate50Pro = new HwMate50Pro();
        HwAdapter hwAdapter = new HwAdapter();
        hwAdapter.setAdapter(hwMate50Pro);
        System.out.println(hwAdapter.USB());
    }
}

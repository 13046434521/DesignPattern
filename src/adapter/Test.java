package adapter;

/**
 * @author jtl
 * @date 2021/7/21 15:07
 * 适配器模式
 */

class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Cable cable = new Cable();
        Adapter adapter = new Adapter(cable);
        computer.setAdapter(adapter);
    }
}

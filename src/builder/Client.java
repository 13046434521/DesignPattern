package builder;

/**
 * @author：TianLong
 * @date：2022/10/17 20:07
 * @detail：客户端类
 */
class Client {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder()
                .setCPU("AMD 5600X")
                .setGPU("NV 3060TI")
                .setMouse("罗技 MX MASTER3")
                .setKeyBoard("IQUNIX F97")
                .create();

        System.out.println(computer.toString());
    }
}

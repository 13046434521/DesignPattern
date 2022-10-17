package builder;

/**
 * @author：TianLong
 * @date：2022/10/17 20:15
 * @detail：传统创建对象方法
 */
class BuilderDemo {
    public static void main(String[] args) {
        Computer computer = new Computer("MAC OS","微星 B550M","IQUNIX F97","罗技 MX MASTER3","INTEL I5","NV 3060TI");
        System.out.println(computer.toString());
    }

    static class Computer {
        private String mOS;
        private String mBroad;
        private String mKeyBoard;
        private String mMouse;
        private String mCPU;
        private String mGPU;

        public Computer(String OS, String broad, String keyBoard, String mouse, String CPU, String GPU) {
            mOS = OS;
            mBroad = broad;
            mKeyBoard = keyBoard;
            mMouse = mouse;
            mCPU = CPU;
            mGPU = GPU;
        }

        @Override
        public String toString() {
            return "Computer{" +
                    "mOS='" + mOS + '\'' +
                    ", mBroad='" + mBroad + '\'' +
                    ", mKeyBoard='" + mKeyBoard + '\'' +
                    ", mMouse='" + mMouse + '\'' +
                    ", mCPU='" + mCPU + '\'' +
                    ", mGPU='" + mGPU + '\'' +
                    '}';
        }
    }
}

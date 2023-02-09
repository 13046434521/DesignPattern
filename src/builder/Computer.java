package builder;

/**
 * @author：TianLong
 * @date：2022/10/17 19:58
 * @detail：产品类
 */
class Computer{
    private String mOS;
    private String mBroad;
    private String mKeyBoard;
    private String mMouse;
    private String mCPU;
    private String mGPU;
    private Computer(String OS, String broad, String keyBoard, String mouse, String CPU, String GPU) {
        mOS = OS;
        mBroad = broad;
        mKeyBoard = keyBoard;
        mMouse = mouse;
        mCPU = CPU;
        mGPU = GPU;
    }

    public static ComputerBuilder createBuilder(){
        return new ComputerBuilder();
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

    /**
     * @author：TianLong
     * @date：2022/10/17 19:58
     * @detail：产品建造者类
     */
    public static class ComputerBuilder{
        private String mOS = "Windows";
        private String mBroad= "微星 B550M";
        private String mKeyBoard= "无";
        private String mMouse= "无";
        private String mCPU= "Intel I5";
        private String mGPU= "AMD 6600XT";

        public ComputerBuilder setOS(String OS) {
            mOS = OS;
            return this;
        }

        public ComputerBuilder setBroad(String broad) {
            mBroad = broad;
            return this;
        }

        public ComputerBuilder setKeyBoard(String keyBoard) {
            mKeyBoard = keyBoard;
            return this;
        }

        public ComputerBuilder setMouse(String mouse) {
            mMouse = mouse;
            return this;
        }

        public ComputerBuilder setCPU(String CPU) {
            mCPU = CPU;
            return this;
        }

        public ComputerBuilder setGPU(String GPU) {
            mGPU = GPU;
            return this;
        }

        public Computer build(){
            // 可以在build方法中做一些校验等其他工作
            if (mBroad.contains("技嘉")){
                throw new RuntimeException("技嘉辱华，不支持技嘉主板");
            }


            Computer computer = new Computer(mOS,mBroad,mKeyBoard,mMouse,mCPU,mGPU);
            return computer;
        }
    }
}

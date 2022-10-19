package chain;

/**
 * @author：TianLong
 * @date：2022/10/19 20:30
 * @detail：客户端
 */
class Client {
    public static void main(String[] args) {
        Leader leader = new Leader();
        CHO cho = new CHO();
        Boss boss = new Boss();
        leader.nextHandler = cho;
        cho.nextHandler = boss;

        // 直接从责任链的最底端，向leader提出申请
        leader.handle(500);
        leader.handle(2000);
        // 可以跃过leader，找CHO提出申请
        cho.handle(8000);
        leader.handle(15000);
    }
}

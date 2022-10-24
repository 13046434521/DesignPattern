package proxy;

/**
 * @author：TianLong
 * @date：2022/10/24 19:12
 * @detail：客户端，将实际主题类，交给代理主题类。实际主题类内部如何实现和客户端无关
 */
class Client {
    public static void main(String[] args) {
        // 实际打官司的人
        XiaoHong xiaoHong = new XiaoHong();
        // 帮助打官司的律师，
        Lawyer lawyer = new Lawyer();
        lawyer.setILawyer(xiaoHong);
        // 律师帮忙执行的步骤，实际上是小红该执行的步骤
        lawyer.submit();
        lawyer.defend();
        lawyer.finish();
    }
}

package proxy.uml;

/**
 * @author：TianLong
 * @date：2022/10/24 18:20
 * @detail：真实主题类，真正实现抽象方法的类
 */
class RealSubject implements Subject{
    @Override
    public void visit() {
        System.out.println("Real主题 visit");
    }
}

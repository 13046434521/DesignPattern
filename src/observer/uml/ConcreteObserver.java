package observer.uml;

/**
 * @author：TianLong
 * @date：2022/10/20 0:41
 * @detail：具体主题类
 */
class ConcreteObserver implements Observer {
    @Override
    public void update(Object o) {
        System.out.println("更新数据:" + o.toString());
    }
}

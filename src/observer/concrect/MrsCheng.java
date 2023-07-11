package observer.concrect;

/**
 * @author：TianLong
 * @date：2022/10/20 1:05
 * @detail：实际观察者类，欠薪员工
 */
class MrsCheng implements Observer {
    @Override
    public void takeMoney(Object o) {
        System.out.println("终于还给MrsCheng工资了");
    }
}

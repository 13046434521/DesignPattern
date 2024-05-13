package factory;

/**
 * 作者：jtl
 * <p>
 * 日期：Created in 2023/7/19 0:13
 * <p>
 * 描述：
 */

interface IProducts {
    String name = null;

    default void printMsg() {
        System.out.println(this.getClass());
    }
}

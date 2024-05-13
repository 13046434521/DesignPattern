package factory;

/**
 * 作者：jtl
 * <p>
 * 日期：Created in 2023/7/19 0:14
 * <p>
 * 描述：
 */


interface IFactory<T extends IProducts> {
    T buildProducts();
}
package flyweight;

/**
 * 作者：jtl
 * <p>
 * 日期：Created in 2023/7/19 0:42
 * <p>
 * 描述：
 */

interface IMessage {

    IMessage obtain();


    void recycle();

}

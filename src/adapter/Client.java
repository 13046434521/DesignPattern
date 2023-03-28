package adapter;


/**
 * Author（作者）：jtl
 * Date（日期）：2023/2/20 00:20
 * Detail（详情）：
 */
public class Client {
    public static void main(String[] args) {
        MacBook macBook = new MacBook();
        macBook.setData("我要传输数据显示");

        HDDock hdDock = new HDDock();
        hdDock.linkType(macBook.typeC());
        hdDock.typeC2Hdmi();
        HDMI hdmi = hdDock.getHdmi();


        Display display = new Display();
        display.linkHDMI(hdmi);
        display.show();
    }
}

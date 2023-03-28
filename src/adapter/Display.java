package adapter;

/**
 * Author（作者）：jtl
 * Date（日期）：2023/3/29 00:51
 * Detail（详情）：
 */
public class Display {
    private HDMI hdmi;
    public void linkHDMI(HDMI hdmi){
        this.hdmi = hdmi;
    }

    public String show(){
        return hdmi.data;
    }
}

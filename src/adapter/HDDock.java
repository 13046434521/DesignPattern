package adapter;

/**
 * Author（作者）：jtl
 * Date（日期）：2023/2/20 00:17
 * Detail（详情）：扩展坞
 */
public class HDDock {
    private TypeC typeC = null;
    private HDMI hdmi = new HDMI();
    public void linkType(TypeC typeC){
       this.typeC = typeC;
    }

    public void typeC2Hdmi(){
        hdmi.setData(typeC.data);
    }

    public TypeC getTypeC(){
        return typeC;
    }

    public HDMI getHdmi(){
        return hdmi;
    }
}

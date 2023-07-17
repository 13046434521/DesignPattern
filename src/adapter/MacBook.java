package adapter;

/**
 * Author（作者）：jtl
 * Date（日期）：2023/3/29 00:51
 * Detail（详情）：
 */
public class MacBook {
    private TypeC typeC = new TypeC("传输信号");
    public TypeC typeC(){
        return typeC;
    }

    public void setData(String data){
        typeC.data = data;
    }
}

package adapter;

/**
 * Author（作者）：jtl
 * Date（日期）：2023/3/29 00:51
 * Detail（详情）：
 */
public class MacBook {
    private final TypeC typeC = new TypeC();
    public TypeC typeC(){
        return typeC;
    }

    public void setData(String data){
//        typeC.data = data;
    }
}

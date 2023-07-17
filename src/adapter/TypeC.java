package adapter;

/**
 * Author（作者）：jtl
 * Date（日期）：2023/2/20 00:20
 * Detail（详情）：
 */
public class TypeC {
    public String data ="";

    public TypeC(String data) {
        this.data = data;
    }

    public void putData(String data){
        this.data = data;
    }
    public String getData() {
        return data;
    }
}

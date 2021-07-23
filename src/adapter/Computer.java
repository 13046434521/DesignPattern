package adapter;

/**
 * @author jtl
 * @date 2021/7/21 14:56
 */

class Computer {
    public void setAdapter(NetToUsb adapter){
        adapter.handleRequest();
    }
}

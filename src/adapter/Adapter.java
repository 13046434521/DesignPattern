package adapter;

/**
 * @author jtl
 * @date 2021/7/21 14:56
 */

class Adapter implements NetToUsb{
    private Cable mCable;

    public Adapter(Cable cable) {
        mCable = cable;
    }

    @Override
    public void handleRequest() {
        mCable.request();
    }
}

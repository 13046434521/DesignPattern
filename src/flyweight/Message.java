package flyweight;

/**
 * 作者：jtl
 * <p>
 * 日期：Created in 2023/7/19 9:36
 * <p>
 * 描述：
 */

class Message implements IMessage {
    private static final Object spoolLock = new Object();
    private static final int sMaxPoolSize = 50;
    private static Message sPool;
    private static int sPoolSize = 0;
    private Message next;

    @Override
    public IMessage obtain() {
        synchronized (spoolLock) {
            if (sPool != null) {
                Message m = sPool;
                sPool = m.next;
                m.next = null;
                sPoolSize--;

                return m;
            }
        }

        return new Message();
    }

    @Override
    public void recycle() {
        synchronized (spoolLock) {
            if (sPoolSize < sMaxPoolSize) {
                next = sPool;
                sPool = this;
                sPoolSize++;
            }
        }
    }
}

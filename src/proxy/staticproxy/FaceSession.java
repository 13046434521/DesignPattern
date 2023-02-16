package proxy.staticproxy;

/**
 * Author（作者）：jtl
 * Date（日期）：2023/2/16 14:53
 * Detail（详情）：实际产品类
 */
public class FaceSession implements IFaceDetect{
    @Override
    public void faceDetect() {
        // 模拟人脸检测耗时
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void faceLiveness() {
        // 模拟活体检测耗时
        try {
            Thread.sleep(120);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void faceQuality() {
        // 模拟质量评估耗时
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

package proxy.staticproxy;

/**
 * Author（作者）：jtl
 * Date（日期）：2023/2/16 14:54
 * Detail（详情）：代理类
 */
public class FaceTimeProxy implements IFaceDetect{
    private IFaceDetect faceDetect;

    public FaceTimeProxy(IFaceDetect faceDetect){
        this.faceDetect = faceDetect;
    }

    @Override
    public void faceDetect() {
       long tt = System.currentTimeMillis();
       faceDetect.faceDetect();
       long time = System.currentTimeMillis()-tt;
        System.out.println("人脸耗时测试代理类：人脸检测耗时："+time);
    }

    @Override
    public void faceLiveness() {
        long tt = System.currentTimeMillis();
        faceDetect.faceLiveness();
        long time = System.currentTimeMillis()-tt;
        System.out.println("人脸耗时测试代理类：活体测耗时："+time);
    }

    @Override
    public void faceQuality() {
        long tt = System.currentTimeMillis();
        faceDetect.faceQuality();
        long time = System.currentTimeMillis()-tt;
        System.out.println("人脸耗时测试代理类：质量评估耗时："+time);
    }
}

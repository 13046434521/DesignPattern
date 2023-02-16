package proxy.staticproxy;

/**
 * Author（作者）：jtl
 * Date（日期）：2023/2/16 15:26
 * Detail（详情）：
 */
public class FacePermissionProxy implements IFaceDetect{
    private IFaceDetect faceDetect;

    public FacePermissionProxy(IFaceDetect faceDetect){
        this.faceDetect = faceDetect;
    }
    @Override
    public void faceDetect() {
        System.out.println("人脸权限代理类：相机权限检测");
        faceDetect.faceDetect();
    }

    @Override
    public void faceLiveness() {
        System.out.println("人脸权限代理类：相机权限检测");
        faceDetect.faceLiveness();
    }

    @Override
    public void faceQuality() {
        System.out.println("人脸权限代理类：相机权限检测，本地读写权限检测");
        faceDetect.faceQuality();
    }
}

package proxy.staticproxy;

/**
 * Author（作者）：jtl
 * Date（日期）：2023/2/16 15:30
 * Detail（详情）：客户端
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("-------------第一种情况-------------");

        IFaceDetect iFaceDetect1 = new FacePermissionProxy(new FaceTimeProxy(new FaceSession()));

        iFaceDetect1.faceDetect();
        iFaceDetect1.faceLiveness();
        iFaceDetect1.faceQuality();


        System.out.println("-------------第二种情况-------------");

        IFaceDetect iFaceDetect2 = new FaceTimeProxy(new FacePermissionProxy(new FaceSession()));
        iFaceDetect2.faceDetect();
        iFaceDetect2.faceLiveness();
        iFaceDetect2.faceQuality();
    }
}

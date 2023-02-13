package templatemethod;

/**
 * Author（作者）：jtl
 * Date（日期）：2023/2/10 20:04
 * Detail（详情）：模版方法模式客户端
 */
public class Client {
    public static void main(String[] args) {
        CCTVSpringFestivalGala cctv = new CCTVSpringFestivalGala();
        cctv.start();

        System.out.println("----------------分割线----------------");

        SpringFestivalGalaOfLiaoning liaoning = new SpringFestivalGalaOfLiaoning();
        liaoning.start();
    }
}

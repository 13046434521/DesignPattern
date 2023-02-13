package templatemethod;

/**
 * Author（作者）：jtl
 * Date（日期）：2023/2/10 20:53
 * Detail（详情）：具体模版，CCTV 央视春晚
 */
public class CCTVSpringFestivalGala extends SpringFestivalGala{
    @Override
    public void prologue() {
        System.out.println("开场白：欢迎来到，2023年，央视春晚的现场");
    }

    @Override
    public void song() {
        System.out.println("歌曲：邓超-好运全都来");
    }

    @Override
    public void comedySketch() {
        System.out.println("小品：于震-初见照相馆");
    }

    @Override
    public void dance() {
        System.out.println("舞蹈：辽宁芭蕾舞团：我们的田野上");
    }
}

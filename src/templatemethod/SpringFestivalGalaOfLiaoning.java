package templatemethod;

/**
 * Author（作者）：jtl
 * Date（日期）：2023/2/10 20:42
 * Detail（详情）：具体模版，辽宁春晚
 */
public class SpringFestivalGalaOfLiaoning implements SpringFestivalGala {
    @Override
    public void prologue() {
        System.out.println("开场白：欢迎来到，2023年，辽宁卫视春晚现场");
    }

    @Override
    public void song() {
        System.out.println("歌曲：孙楠，谭维维-追光");
    }

    @Override
    public void comedySketch() {
        System.out.println("小品：宋小宝-杨树林：非常营销");
    }

    @Override
    public void dance() {
        System.out.println("舞蹈：舞蹈-欢庆中国年");
    }
}

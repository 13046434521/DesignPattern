package templatemethod;

/**
 * Author（作者）：jtl
 * Date（日期）：2023/2/10 20:05
 * Detail（详情）：春晚流程（春晚模版 ）
 */
public abstract class SpringFestivalGala {
    public void start(){
        prologue();
        song();
        dance();
        comedySketch();
        unforgettableTonight();
    }
    /**
     * 开场白
     */
    public abstract void prologue();
    /**
     * 歌曲节目
     */
    public abstract void song();

    /**
     * 小品节目
     */
    public abstract void comedySketch();
    /**
     * 舞蹈节目
     */
    public abstract void dance();
    /**
     * 难忘今宵
     */
    private void unforgettableTonight(){
        System.out.println("结尾：难忘今宵");
    }
}

package templatemethod;

/**
 * Author（作者）：jtl
 * Date（日期）：2023/2/10 20:05
 * Detail（详情）：春晚流程（春晚模版 ）
 */
public interface SpringFestivalGala {
    default void start() {
        // 1. 开场白
        prologue();
        // 2. 唱歌
        song();
        // 3. 跳舞
        dance();
        // 4. 小品
        comedySketch();
        // 5. 难忘今宵
        unforgettableTonight();
    }

    /**
     * 开场白
     */
    void prologue();

    /**
     * 歌曲节目
     */
    void song();

    /**
     * 小品节目
     */
    void comedySketch();

    /**
     * 舞蹈节目
     */
    void dance();

    /**
     * 难忘今宵
     */
    default void unforgettableTonight() {
        System.out.println("结尾：难忘今宵");
    }
}

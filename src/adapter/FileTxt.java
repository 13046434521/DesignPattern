package adapter;

/**
 * 作者：jtl
 * <p>
 * 日期：Created in 2023/7/12 0:17
 * <p>
 * 描述：Txt文件类
 */
class FileTxt {
    private final String content;

    protected FileTxt(String content) {
        this.content = content;
    }

    protected String getContent() {
        return content;
    }
}

package adapter;

/**
 * 作者：jtl
 * <p>
 * 日期：Created in 2023/7/12 0:27
 * <p>
 * 描述：TypeC接口，可以传输数据
 */

class TypeC {
    private FileTxt fileTxt = null;

    /**
     * 传输数据
     *
     * @param fileTxt 传入的文件
     */
    public void transferFile(FileTxt fileTxt) {
        this.fileTxt = fileTxt;
    }

    /**
     * @return 传出的文件
     */
    public FileTxt getFile() {
        return fileTxt;
    }
}

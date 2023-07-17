package adapter;

/**
 * 作者：jtl
 * <p>
 * 日期：Created in 2023/7/12 0:12
 * <p>
 * 描述：U盘
 */

class USBDisk {
    private final FileTxt fileTxt;

    public USBDisk(FileTxt fileTxt) {
        this.fileTxt = fileTxt;
    }

    public FileTxt getFile() {
        return fileTxt;
    }
}

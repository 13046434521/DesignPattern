package adapter;

/**
 * 作者：jtl
 * <p>
 * 日期：Created in 2023/7/12 0:24
 * <p>
 * 描述：MacBookPro的扩展坞
 */

class MacBookAdapter {
    private final USBDisk usbDisk;
    private final TypeC typeC = new TypeC();

    // 扩展坞上USB接口插入的U盘
    MacBookAdapter(USBDisk usbDisk) {
        this.usbDisk = usbDisk;
        refreshData();
    }

    // 将USB文件通过TypeC进行传输
    protected void refreshData() {
        FileTxt file = usbDisk.getFile();
        typeC.transferFile(file);
    }

    // 扩展坞上的TypeC线的一端，可以插入电脑端TypeC接口
    public TypeC outPutTypeC() {
        return typeC;
    }
}

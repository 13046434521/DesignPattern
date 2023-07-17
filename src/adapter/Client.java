package adapter;

/**
 * @author：TianLong
 * @date：2022/10/19 17:28
 * @detail：客户端类
 */
class Client {
    public static void main(String[] args) {
        // U盘中有一个Txt文件，内容为出师表
        USBDisk usbDisk = new USBDisk(new FileTxt("出师表\n诸葛亮\n先帝创业未半而中道崩殂，今天下三分，益州疲弊，此诚危急存亡之秋也。然侍卫之臣不懈于内，忠志之士忘身于外者，盖追先帝之殊遇，欲报之于陛下也。\n诚宜开张圣听，以光先帝遗德，恢弘志士之气，不宜妄自菲薄，引喻失义，以塞忠谏之路也。\n" +
                "宫中府中，俱为一体，陟罚臧否，不宜异同。若有作奸犯科及为忠善者，宜付有司论其刑赏，以昭陛下平明之理，不宜偏私，使内外异法也。\n" +
                "侍中、侍郎郭攸之、费祎、董允等，此皆良实，志虑忠纯，是以先帝简拔以遗陛下。愚以为宫中之事，事无大小，悉以咨之，然后施行，必能裨补阙漏，有所广益。"));
        // 有一个MacBook电脑，只有TypeC接口
        MacBookPro macBookPro = new MacBookPro();
        // 将U盘插入有USB接口的扩展坞中
        MacBookAdapter macBookAdapter = new MacBookAdapter(usbDisk);
        // 将扩展坞的TypeC一端插入MacBookPro上
        TypeC typeC = macBookAdapter.outPutTypeC();
        macBookPro.setTypeC(typeC);
        // 获取USB中的文件，输出
        macBookPro.show();
    }
}
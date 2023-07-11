package adapter;

/**
 * @author：TianLong
 * @date：2022/10/19 17:19
 * @detail：适配器类，iphone的Lighting数据线
 */
class IphoneAdapter implements IComputer {
    private IPhone14Pro iphone;

    public void setAdapter(IPhone14Pro iphone) {
        this.iphone = iphone;
    }

    @Override
    public String USB() {
        String port = iphone.Lightning();
        return "将Iphone的" + port + "转成USB接口";
    }
}

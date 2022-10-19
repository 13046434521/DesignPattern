package adapter;

/**
 * @author：TianLong
 * @date：2022/10/19 17:27
 * @detail：适配器类，华为的TypeC数据线
 */
class HwAdapter implements IComputer{
    private HwMate50Pro mate50Pro;

    public void setAdapter(HwMate50Pro mate50Pro) {
        this.mate50Pro = mate50Pro;
    }

    @Override
    public String USB() {
        String port = mate50Pro.typeC();
        return "将华为的"+port+"转成USB接口";
    }
}

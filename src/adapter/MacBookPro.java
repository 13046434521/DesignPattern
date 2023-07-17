package adapter;


/**
 * 作者：jtl
 * <p>
 * 日期：Created in 2023/7/12 0:14
 * <p>
 * 描述：MacBookPro电脑，没有USB接口，只有TypeC接口
 */

class MacBookPro {
    private TypeC typeC;

    /**
     * @param typeC 电脑端插入的TypeC接口
     */
    public void setTypeC(TypeC typeC) {
        this.typeC = typeC;
    }

    /**
     * 电脑端显示的文本内容
     */
    public void show() {
        if (typeC != null) {
            System.out.println(typeC.getFile().getContent());
        } else {
            System.out.println("typeC接口什么都没插");
        }
    }
}

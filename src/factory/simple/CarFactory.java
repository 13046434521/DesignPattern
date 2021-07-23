package factory.simple;

/**
 * @author jtl
 * @date 2021/7/20 16:18
 * 简单工厂模式
 */

class CarFactory {

    public static Car getCar(String name) {
        Car car =null ;
        switch (name){
            case "五菱宏光":
                car = new Wuling();
                break;
            case "宝马":
                car = new BMW();
                break;
            case "特斯拉":
                car = new Tesla();
                break;
            case "比亚迪":
                car = new BYD();
                break;
            default:
                car = null;
                break;
        }

        return car;
    }
}

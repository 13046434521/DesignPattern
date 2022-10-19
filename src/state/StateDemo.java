package state;

/**
 * @author：TianLong
 * @date：2022/10/18 20:53
 * @detail：传统实现方式
 */
class StateDemo {
    public static void main(String[] args) {
        Client client = new Client();
        client.loin();
        client.favorite();
    }


    public static class Client {
        private static final int UN_LOGIN_STATE = 0;
        private static final int LOGIN_STATE = 1;
        private static final int INTERDICTION_STATE = 2;

        public int state = UN_LOGIN_STATE;

        /**
         * 登录方法
         */
        public void loin() {
            switch (state) {
                case LOGIN_STATE:
                    System.out.println("账号已登录，无需再次登录");
                    break;

                case INTERDICTION_STATE:
                    System.out.println("账号被封,请先解封");
                    // 账号解封业务操作
                    break;

                default:
                    System.out.println("账号尚未登录，请先登录");
                    // 登录账号操作，如果登录成功，改变state状态
                    state = LOGIN_STATE;
                    System.out.println("账号登录成功");
                    break;
            }
        }

        /**
         * 收藏
         */
        public void favorite() {
            switch (state) {
                case LOGIN_STATE:
                    System.out.println("收藏商品成功");
                    break;

                case INTERDICTION_STATE:
                    System.out.println("账号被封,请先解封");
                    break;

                default:
                    System.out.println("账号尚未登录，请先登录");
                    break;

            }
        }
    }
}

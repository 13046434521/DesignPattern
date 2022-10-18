package prototype;

import java.util.ArrayList;

/**
 * @author：TianLong
 * @date：2022/10/18 19:52
 * @detail：客户端
 */
class Client {
    public static void main(String[] args) {
        ArrayList<String>arrayList=new ArrayList<>();
        arrayList.add("丑小鸭");
        arrayList.add("白雪公主");
        arrayList.add("小红帽");
        Book book = new Book(arrayList,"安徒生",20,"人民出版社");
        Book cloneBook = book.clone();

        // 引用数据类型
        book.articles.add("大闹天宫");
        // 数据输出
        System.out.println(book.toString());
        System.out.println(cloneBook.toString());
    }
}

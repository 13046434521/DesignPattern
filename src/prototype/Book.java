package prototype;

import java.util.ArrayList;

/**
 * @author：TianLong
 * @date：2022/10/18 19:47
 * @detail：原型模式 具体实现类
 */
class Book implements Cloneable{
    public ArrayList<String> articles = new ArrayList<>();
    public String author = "";
    public int price = 0;
    public String publishers = "";



    @Override
    public Book clone() {
        Book book = null;
        try {
          book = (Book) super.clone();
          book.articles = (ArrayList<String>) this.articles.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        return book;
    }

    public Book(ArrayList<String> articles, String author, int price, String publishers) {
        this.articles = articles;
        this.author = author;
        this.price = price;
        this.publishers = publishers;
    }

    @Override
    public String toString() {
        return "Book{" +
                "articles=" + articles +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", publishers='" + publishers + '\'' +
                '}';
    }
}

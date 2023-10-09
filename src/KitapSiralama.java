
import java.util.*;

class Book implements Comparable<Book> {
    private String baslik;
    private int sayfaSayisi;
    private String yazar;
    private Date yayinTarihi;

    public Book(String title, int pageCount, String author, Date publicationDate) {
        this.baslik = title;
        this.sayfaSayisi = pageCount;
        this.yazar = author;
        this.yayinTarihi = publicationDate;
    }

    public String getTitle() {
        return baslik;
    }

    public int getPageCount() {
        return sayfaSayisi;
    }

    public String getAuthor() {
        return yazar;
    }

    public Date getPublicationDate() {
        return yayinTarihi;
    }

    @Override
    public int compareTo(Book other) {
        // Kitapları isme göre sıralamak için compareTo yöntemini kullanın.
        return this.baslik.compareTo(other.baslik);
    }

    @Override
    public String toString() {
        return "Book{" +
                "baslik='" + baslik + '\'' +
                ", pageCount=" + sayfaSayisi +
                ", author='" + yazar + '\'' +
                ", publicationDate=" + yayinTarihi +
                '}';
    }
}

public class KitapSiralama {
    public static void main(String[] args) {
        // Kitap nesnelerini oluşturun
        Book book1 = new Book("İnci", 200, "John Steinbeck", new Date());
        Book book2 = new Book("Dört Kardeştiler", 300, "Gülten Dayıoğlu", new Date());
        Book book3 = new Book("Othello", 250, "William Shakespeare", new Date());
        Book book4 = new Book("Fareler ve İnsanlar", 400, "John Steinbeck", new Date());
        Book book5 = new Book("Notre Dame'ın Kamburu", 350, "Victor Hugo", new Date());

        //aşağoıda isme göre sıralıdır
        Set<Book> bookSetByName = new TreeSet<>();
        bookSetByName.add(book1);
        bookSetByName.add(book2);
        bookSetByName.add(book3);
        bookSetByName.add(book4);
        bookSetByName.add(book5);

    //bu treesette sayfa sayısına göre sıraldır.
        TreeSet<Book> bookSetByPageCount = new TreeSet<>(Comparator.comparingInt(Book::getPageCount));
        bookSetByPageCount.addAll(bookSetByName);

        System.out.println("Kitapların isme göre sıralı hali şöyle:");
        for (Book book : bookSetByName) {
            System.out.println(book);
        }

        System.out.println("\nKitapların sayfa sayısına göre sıralı hali şöyle:");
        for (Book book : bookSetByPageCount) {
            System.out.println(book);
        }
    }
}

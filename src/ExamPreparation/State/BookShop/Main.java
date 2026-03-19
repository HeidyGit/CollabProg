package ExamPreparation.State.BookShop;
public class Main {

    public static void main(String[] args) {

        BookShop bookShop = new BookShop();

        bookShop.sellBook();
        bookShop.returnBook();
        bookShop.packBook();
        bookShop.packBook();
        bookShop.deliverBook();
        bookShop.returnBook();


    }
}

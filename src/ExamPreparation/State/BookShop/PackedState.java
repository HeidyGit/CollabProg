package ExamPreparation.State.BookShop;
public class PackedState implements States {

    BookShop bookShop;

    public PackedState(BookShop bookShop) {
        this.bookShop = bookShop;
    }

    @Override
    public void sellBook() {
        System.out.println("the book has already been soled");
    }

    @Override
    public void packBook() {
        System.out.println("The book is already packed ! ");
    }

    @Override
    public void deliverBook() {
        System.out.println("The book is sent to customer");
        bookShop.setState(bookShop.getDeliveredState());
    }

    @Override
    public void returnBook() {
        System.out.println("The book hasn't been sent !");
    }
}

package ExamPreparation.State.BookShop;
public class DeliveredState implements States {

    BookShop bookShop;

    public DeliveredState(BookShop bookShop) {
        this.bookShop = bookShop;
    }

    @Override
    public void sellBook() {
        System.out.println("The book is already sold");
    }

    @Override
    public void packBook() {
        System.out.println("The book is already packed");
    }

    @Override
    public void deliverBook() {
        System.out.println("The book has already been delivered");
    }

    @Override
    public void returnBook() {
        System.out.println("Customer unsatisfied. The book has been returned !");
        bookShop.setState(bookShop.getInStockState());
    }
}

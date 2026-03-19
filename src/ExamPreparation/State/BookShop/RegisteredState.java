package ExamPreparation.State.BookShop;
public class RegisteredState implements States {
    BookShop bookShop;

    public RegisteredState(BookShop bookShop) {
        this.bookShop = bookShop;
    }

    @Override
    public void sellBook() {
        System.out.println("the book has already been sold");
    }

    @Override
    public void packBook() {
        System.out.println("The book has been packed. Ready to be sent");
        bookShop.setState(bookShop.getPackedState());
    }

    @Override
    public void deliverBook() {
        System.out.println("The book can't be delivered yet. It has not been packed !");
    }

    @Override
    public void returnBook() {
        System.out.println("The book hasn't been sent !");
    }
}

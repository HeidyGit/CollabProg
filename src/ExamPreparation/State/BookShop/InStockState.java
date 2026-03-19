package ExamPreparation.State.BookShop;
public class InStockState implements States {

    BookShop bookShop;

    public InStockState(BookShop bookShop){
        this.bookShop = bookShop;
    }

    @Override
    public void sellBook() {
        System.out.println("The book has been registered. Ready to be packed");
        bookShop.setState(bookShop.getRegisteredState());
    }

    @Override
    public void packBook() {
        System.out.println("The book has been yet been registed");
    }

    @Override
    public void deliverBook() {
        System.out.println("The book has been yet been registed");
    }

    @Override
    public void returnBook() {
        System.out.println("The book has been yet been registed");
    }
}

package ExamPreparation.State.BookShop;

public class BookShop {

    States inStockState;
    States registeredState;
    States packedState;
    States deliveredState;

    States state;

public BookShop(){
    this.inStockState = new InStockState(this);
    this.registeredState = new RegisteredState(this);
    this.packedState = new PackedState(this);
    this.deliveredState = new DeliveredState(this);
    state = inStockState;
}

    public void sellBook(){
    state.sellBook();
    }

    public void packBook(){
    state.packBook();
    }

    public void deliverBook(){
    state.deliverBook();
    }

    public void returnBook(){
    state.returnBook();
    }


    public States getInStockState() {
        return inStockState;
    }

    public States getRegisteredState() {
        return registeredState;
    }

    public States getPackedState() {
        return packedState;
    }

    public States getDeliveredState() {
        return deliveredState;
    }

    public States getState() {
        return state;
    }

    public void setState(States state){
    this.state = state;
    }

}

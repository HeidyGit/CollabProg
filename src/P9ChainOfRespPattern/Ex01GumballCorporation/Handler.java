package P9ChainOfRespPattern.Ex01GumballCorporation;

public abstract class Handler {
    protected Handler mailSuccessor;

    public void setSuccessor(Handler successor) {
        this.mailSuccessor = successor;
    }

    public abstract void handleMail (Mail mail);
}

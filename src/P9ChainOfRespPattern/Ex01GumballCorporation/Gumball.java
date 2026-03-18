package P9ChainOfRespPattern.Ex01GumballCorporation;

public class Gumball {
    public static void main(String[] args) {

        Handler spam = new SpamHandler();
        Handler fan = new FanHandler();
        Handler request = new NewLocalHandler();
        Handler complain = new ComplainHandler();

        spam.setSuccessor(fan);
        fan.setSuccessor(complain);
        complain.setSuccessor(request);


        spam.handleMail(new Mail("Fan")) ;

    }
}

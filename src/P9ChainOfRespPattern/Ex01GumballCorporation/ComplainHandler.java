package P9ChainOfRespPattern.Ex01GumballCorporation;

public class ComplainHandler extends Handler {

    private String complainTag = "Complain";

    @Override
    public void handleMail (Mail mail) {
        if (mail.getMailTag().equals(complainTag)) {
            System.out.println("ComplainHandler: Redirecting complain mail to Legal Departement.");
        }else {
            mailSuccessor.handleMail (mail);
        }
    }
}

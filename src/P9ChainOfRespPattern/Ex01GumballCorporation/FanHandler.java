package P9ChainOfRespPattern.Ex01GumballCorporation;

public class FanHandler extends Handler{
    private String fanTag = "Fan";

    @Override
    public void handleMail (Mail mail) {
        if (mail.getMailTag().equals(fanTag)) {
            System.out.println("FanHandler: Redirecting fan mail to Ceo.");
        } else if (mailSuccessor != null) {
            mailSuccessor.handleMail(mail);
        }
    }
}

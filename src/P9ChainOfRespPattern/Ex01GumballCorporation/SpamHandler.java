package P9ChainOfRespPattern.Ex01GumballCorporation;

import java.util.List;

public class SpamHandler extends Handler {
    private String spamTag = "Spam";

    @Override
    public void handleMail(Mail mail) {
        if (mail.getMailTag().equals(spamTag)) {
            System.out.println("SpamHandler: Deleting spam mail.");
        } else {
            mailSuccessor.handleMail(mail);
        }
    }

}

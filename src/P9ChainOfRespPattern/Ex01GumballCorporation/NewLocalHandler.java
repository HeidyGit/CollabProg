package P9ChainOfRespPattern.Ex01GumballCorporation;

public class NewLocalHandler extends Handler{
    private String machineRequestTag = "Request Machine";

    @Override
    public void handleMail (Mail mail) {
        if (mail.getMailTag().equals(machineRequestTag)) {
            System.out.println("RequesterHandler: Redirecting request mail to Business developpement departement.");
        }else{
            mailSuccessor.handleMail (mail);
        }
    }

}

package ExamPreparation.Decorator.decorator;

import ExamPreparation.Decorator.Message;
import ExamPreparation.Decorator.composite.Recepient;

public class SMSDecorator extends NotifierDecorator {
    private Notifier notifier;

    public SMSDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send(Message message, Recepient recepient) {
        notifier.send(message.complete("Sent with SMS / "), recepient);
    }
}

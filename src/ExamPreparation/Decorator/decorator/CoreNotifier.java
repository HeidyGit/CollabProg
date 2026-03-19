package ExamPreparation.Decorator.decorator;

import ExamPreparation.Decorator.Message;
import ExamPreparation.Decorator.composite.Recepient;

public class CoreNotifier implements Notifier {
    @Override
    public void send(Message message, Recepient recepient) {
        recepient.receives(message.complete("Sent on the computer / "));
    }
}

package ExamPreparation.Decorator.decorator;

import ExamPreparation.Decorator.Message;
import ExamPreparation.Decorator.composite.Recepient;

public class TelegramDecorator extends NotifierDecorator {
    private Notifier notifier;

    public TelegramDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send(Message message, Recepient recepient) {
        notifier.send(message.complete("Encrypted and sent with Telegram / "), recepient);
    }
}

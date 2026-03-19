package ExamPreparation.Decorator.decorator;

import ExamPreparation.Decorator.Message;

import ExamPreparation.Decorator.composite.Recepient;

public interface Notifier {
    void send(Message message, Recepient recepient);
}

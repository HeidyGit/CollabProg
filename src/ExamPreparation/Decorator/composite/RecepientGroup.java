package ExamPreparation.Decorator.composite;

import ExamPreparation.Decorator.Message;

import java.util.ArrayList;
import java.util.List;

public class RecepientGroup implements Recepient {
    List<Recepient> recepients = new ArrayList<Recepient>();

    public void add(Recepient recepient) {
        recepients.add(recepient);
    }

    @Override
    public void receives(Message message) {
        for(Recepient recepient : recepients) {
            recepient.receives(message);
        }
    }
}

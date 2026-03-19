package ExamPreparation.Decorator;

import ExamPreparation.Decorator.composite.Individual;
import ExamPreparation.Decorator.composite.Recepient;
import ExamPreparation.Decorator.composite.RecepientGroup;
import ExamPreparation.Decorator.decorator.*;

import java.time.LocalDateTime;

// the composite pattern is used because you have a an employee which can be on his own, in a group or even in a group part of a group.
// the decorator pattern is used because you have a decorator which is used when sending a message since it can be sent via many different
// forms of communication like whatsapp, mails and telegram. They can be combined.

public class NotificationTests {
    public static void main(String[] args) {
        // Setting the company hierarchy:
        Recepient marc = new Individual("Marc");
        Recepient matthieu = new Individual("Matthieu");
        Recepient luc = new Individual("Luc");
        Recepient jean = new Individual("Jean");

        //Adding people to the different groups of the company
        RecepientGroup humanressourceDepartment = new RecepientGroup();
        humanressourceDepartment.add(marc);
        humanressourceDepartment.add(matthieu);

        RecepientGroup itDepartment = new RecepientGroup();
        itDepartment.add(luc);
        itDepartment.add(jean);

        //Adding the groups to the company
        RecepientGroup company = new RecepientGroup();
        company.add(itDepartment);
        company.add(humanressourceDepartment);

        // Setting the notification mecanisms:
        // Creating a message
        System.out.println("------- 1ST NOTIFICATION --------");
        Notifier notifier = new CoreNotifier();
        notifier.send(new Message("IT IS TIME TO EAT."), marc);

        System.out.println("------- 2ND NOTIFICATION --------");
        notifier = new SMSDecorator(notifier);
        notifier.send(new Message("DO YOU WANT TO JOIN DINNER?"), humanressourceDepartment);

        System.out.println("------- 3RD NOTIFICATION --------");
        notifier = new WhatsAppDecorator(new TelegramDecorator(notifier));
        notifier.send(new Message("WE ARE GOING TO PLAY FOOTBALL!"), company);

    }
}

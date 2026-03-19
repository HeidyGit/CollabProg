package ExamPreparation.Decorator;

import java.time.LocalDateTime;

public class Message {

    private String content;
    private LocalDateTime time;

    public Message(String content) {
        this.content = content;
        time = LocalDateTime.now();
    }

    public Message complete(String additionalContent) {
        content = additionalContent + content;
        return this;
    }

    @Override
    public String toString() {
        return content + " at time=" + time;
    }
}


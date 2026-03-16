package P9ChainOfRespPattern;

import java.util.Arrays;
import java.util.List;

public class ConcreteHandler3 extends Handler {
    private List<String> myAnimals = Arrays.asList("cat", "dog","horse");

    @Override
    public void handleRequest (Request request) {
        if (myAnimals.contains(request.getValue())){
            System.out.println("ConcreteHandler3 handleRequest");
        }else{
            successor.handleRequest(request);
        }
    }
}

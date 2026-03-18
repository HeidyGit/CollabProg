package P9ChainOfRespPattern.Template;

import java.util.Arrays;
import java.util.List;

public class ConcreteHandler2 extends Handler{
    private List<String> cars =  Arrays.asList ("ferrari", "audi","citroen");

    @Override
    public void handleRequest (Request request) {
        if (cars.contains(request.getValue())){
            System.out.println("ConcreteHandler2 handleRequest");
        }else{
            successor.handleRequest(request);
        }
    }
}


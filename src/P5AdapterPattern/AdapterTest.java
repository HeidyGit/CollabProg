package P5AdapterPattern;

public class AdapterTest {
    public static void main (){
        Adaptee adaptee = new Adaptee();
        Target adapter = new Adapter(adaptee);
        adapter.request();
    }
}

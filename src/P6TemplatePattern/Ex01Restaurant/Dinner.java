package P6TemplatePattern.Ex01Restaurant;

public abstract class Dinner {
    final void prepareTheMenu (){
        serveWater();
        cleanTable();
        prepareVegetables();
        prepareMainMenu ();
        prepareCheese();
        prepareDessert();
        prepareCoffee();
    }

    void serveWater (){
        System.out.println("Serving water");
    };

    void cleanTable (){
        System.out.println("Cleaning Table");
    };

    abstract void prepareVegetables();
    abstract void prepareMainMenu ();
    abstract void prepareCheese();
    abstract void prepareDessert();
    abstract void prepareCoffee();
}

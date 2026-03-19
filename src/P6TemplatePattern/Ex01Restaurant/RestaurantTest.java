package P6TemplatePattern.Ex01Restaurant;

public class RestaurantTest {
    public static void main(String[] args) {
        Dinner sierreDinner = new RestaurantSierre();
        Dinner genevaDinner = new RestaurantGeneva();

        System.out.println("--- Preparing Sierre Dinner ---");
        sierreDinner.prepareTheMenu();

        System.out.println("\n--- Preparing Geneva Dinner ---");
        genevaDinner.prepareTheMenu();
    }

}

package P3AbstractFactoryPattern.Ex1_ArchitectOffice;

public class ArchitectOffice {
    public static void main(String[] args) {
        House house1 = new House("Moder German house",
                new GermanHouseFactory());
        house1.buildHouse();
        house1.calculatePrice();
        showInformation (house1);

        House house2 = new House("Typical dutch house",
                new DutchHouseFactory());
        house2.buildHouse();
        house2.calculatePrice();
        showInformation (house2);

        House house3 = new House("Swiss wood chalet",
                new SwissWoodChaletFactory());
        house3.buildHouse();
        house3.calculatePrice();
        showInformation (house3);
    }

    public static void showInformation(House house){
        System.out.println("House name:" + house.name);
        System.out.println("Price:" + house.calculatePrice());
        System.out.println("Details Price " + "Door:" + house.door.getPrice() + " Window:" + house.window.getPrice());
        System.out.println();

    }
}

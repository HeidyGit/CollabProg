package P3AbstractFactoryPattern.Ex1_ArchitectOffice;
//in the initialisation I call this object so it can not be a abstract calss.
//Mon client
public class House {
    String name;
    Door door;
    Window window;
    HouseFactory housefactory;

    public House (String name, HouseFactory typeOfHouse){
        this.name = name;
        this.housefactory = typeOfHouse;
    }

    public void buildHouse(){
        this.door = this.housefactory.createDoor();
         this.window = this.housefactory.createWindow();
    }

    public double calculatePrice(){
        return this.door.getPrice() + this.window.getPrice();
    }
}

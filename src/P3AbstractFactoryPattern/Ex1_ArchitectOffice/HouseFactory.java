package P3AbstractFactoryPattern.Ex1_ArchitectOffice;
/*
The Abstract Factory is an interface that declares a set of methods
for creating each of the abstract products. */
/*Contract: An interface defines a strict contract:
"Any class that claims to be a HouseFactory must provide a way to create
 a Window and a Door." It doesn't care how they are created,
 just that they are.*/
public interface HouseFactory {
    //public House createHouse();
    /*The HouseFactory is responsible for creating the parts of the house
    (windows, doors). The House class is responsible for assembling those
    parts into a complete house.*/

    Door createDoor();
    Window createWindow();

}

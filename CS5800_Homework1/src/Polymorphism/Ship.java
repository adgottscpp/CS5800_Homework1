package Polymorphism;

/*
Design a CargoShip class that is derived from the Ship class and has the following members:
1.	A member variable for the cargo capacity in tonnage(Int)
2.	Constructor with all setters and getters(Also known as accessors and mutators)
3.	A print function that overrides the base print function and will display the ship name and ships cargo capacity.
Demonstrate the classes in a program that has a static array of Ship size of 3.. The array elements should be initiated dynamically with one type each of Ship, CruiseShip, and CargoShip objects. Create a loop that iterates through the array calling each print function.
 */
public class Ship {
    private String shipName;
    private String shipYearBuilt;

    public Ship(String newShipName, String newShipYearBuilt) {
        this.shipName =  newShipName;
        this.shipYearBuilt = newShipYearBuilt;
    }

    public void setShipName(String newShipName) {
        this.shipName = newShipName;
    }
    public void setShipYearBuilt(String newShipYearBuilt) {
        this.shipYearBuilt = newShipYearBuilt;
    }

    public String getShipName() {
        return shipName;
    }
    public String getShipYearBuilt() {
        return shipYearBuilt;
    }

    public void displayShipInformation() {
        System.out.println("Ship Name: " + shipName + ", " + "Year Ship Was Built: " + shipYearBuilt);
    }
}

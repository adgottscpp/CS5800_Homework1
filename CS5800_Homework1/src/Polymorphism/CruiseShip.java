package Polymorphism;

/*
Design a CruiseShip class that is derived from the Ship class and has the following members:
1.	A member variable for the maximum number of passengers(Int)
2.	Constructor with all setters and getters(Also known as accessors and mutators)
3.	A print function that overrides the base print function and will display the ship name and maximum number of passengers.
 */

public class CruiseShip extends Ship {
    private Integer shipMaxPassengers;

    public CruiseShip(String shipName, String shipYearBuilt, Integer newShipMaxPassengers) {
        super(shipName, shipYearBuilt);
        this.shipMaxPassengers = newShipMaxPassengers;
    }

    public void setShipMaxPassengers(Integer shipMaxPassengers) {
        this.shipMaxPassengers = shipMaxPassengers;
    }

    public Integer getShipMaxPassengers() {
        return shipMaxPassengers;
    }

    public void displayShipInformation() {
        super.displayShipInformation();
        System.out.println("Ship Name: " + getShipName() + ", " + "Cruise Ship Max Passengers: " + shipMaxPassengers);
    }

}

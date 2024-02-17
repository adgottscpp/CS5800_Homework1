package Polymorphism;

import java.lang.reflect.Array;

/*
2)	POLYMORPHISM
Demonstrate the classes in a program that has a static array of Ship size of 3..
The array elements should be initiated dynamically with one type each of Ship, CruiseShip, and CargoShip objects.
Create a loop that iterates through the array calling each print function.
 */
public class PolymorphismDriver {

    public PolymorphismDriver() {
        Ship[] ships = new Ship[3] ;
        ships[0] = new Ship("BaseShip", "2050");
        ships[1] = new CruiseShip("CruiseShip","2051",1000);
        ships[2] = new CargoShip("CargoShip", "2052", 50000);

        for (int i = 0; i < 3; i++) {
            ships[i].displayShipInformation();
        }
    }
}

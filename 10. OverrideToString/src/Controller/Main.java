package Controller;

import Model.Address;

/**
 * Created by kchmiel on 14.04.2017.
 */
public class Main {

    public static void main(String[] args) {
        Address address = new Address("Polska", "podkarpackie", "Strzyżów", "Tałasiewicza 8");
        System.out.println(address);
    }
}

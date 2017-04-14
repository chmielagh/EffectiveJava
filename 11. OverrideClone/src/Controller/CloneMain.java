package Controller;

import Model.Address;

/**
 * Created by kchmiel on 14.04.2017.
 */
public class CloneMain {

    public static void main(String[] args) {
        Address address = new Address("Polska", "podkarpackie", "Strzyżów", "Tałasiewicza 8");
        Address clone = address.clone();
        System.out.println(address);
        System.out.println(clone);
        System.out.println("Equals " + address.equals(clone));
        System.out.println("!= " + (address != clone));
        System.out.println("CLass " + (address.getClass() == clone.getClass()));
    }
}

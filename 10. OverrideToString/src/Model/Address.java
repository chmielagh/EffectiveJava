package Model;

/**
 * Created by kchmiel on 14.04.2017.
 */
public class Address {
    private String country;
    private String state;
    private String city;
    private String street;

    public Address(String country, String state, String city, String street) {
        this.country = country;
        this.state = state;
        this.city = city;
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}

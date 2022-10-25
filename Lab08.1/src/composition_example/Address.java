package composition_example;

public class Address {

    private String city;
    private String country;

    public Address(){

    }
    public Address(String city){
        this();
        setCity(city);
    }
    public Address(String city, String country){
        this(city);
        setCountry(country);
    }

    public String getAddressInfo() {
        return getCity()+" "+getCountry();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return getAddressInfo();
    }
}

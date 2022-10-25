package Television;

public class Television {

    String brand="LG";
    int volume;
    private final static int MAX_VOLUME=100;
    private final static int MIN_VOLUME=0;
    boolean isMuted;
    int oldVolume;
    DisplayType display=DisplayType.LED;

    public Television(){

    }
    public Television(String brand){
        setBrand(brand);
    }

    public Television(String brand, int volume){

        this(brand);
        setVolume(volume);
    }
    public Television(String brand, int volume,DisplayType display){

        this(brand,volume);
        setDisplay(display);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {

        switch(brand){
            case("LG"):this.brand = brand;
            case("Samsung"):this.brand = brand;
            case("Sony"):this.brand = brand;
            case("Toshiba"):this.brand = brand;
            default:return;
        }

    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if(volume<MIN_VOLUME){
            System.out.println("Invalid volume: " +volume +". Volume must be between 0 and 100");
        }else if(volume>MAX_VOLUME){
            System.out.println("Invalid volume: " +volume +". Volume must be between 0 and 100");
        }else{
            this.volume = volume;
            isMuted=false;
        }

    }

    void turnOn(){
        System.out.println(brand+" Turned on");
    }
    void turnOff(){
        System.out.println(brand+" Turned off");
    }

    @Override
    public String toString() {

        if(isMuted()){
            return "Television{" +
                    "brand='" + brand + '\'' +
                    ", volume=<muted>"+  '\'' +
                    ", display=" + getDisplay() +
                    '}';
        }else{
            return "Television{" +
                    "brand='" + getBrand() + '\'' +
                    ", volume=" + getVolume() +
                    ", display=" + getDisplay() +
                    '}';
        }

    }

    public boolean isMuted(){

        if(getVolume()==0){
            return true;
        }else{
            return false;
        }
    }

    public void mute(){

        if(isMuted()){
            volume=oldVolume;
            isMuted=false;
        }else{
            oldVolume=volume;
            volume=0;
            isMuted=true;
        }
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }
}

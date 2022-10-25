import java.sql.SQLOutput;

public class MyOwnPrintln {

    private int environmentInt;
    private String environmentString;

    public void myOwnPrintln(String x) {

        System.out.println(x);

    }

    public void myOwnPrintln(int x) {System.out.println(x);
    }

    public void myOwnPrintln(double x) {System.out.println(x);
    }
    public void myMethod(){

        int myLocalIntVariable=1;

        String myLocalStringVariable="0";

        System.out.println(myLocalIntVariable);
        System.out.println(myLocalStringVariable);
        System.out.println((environmentInt));
        System.out.println(environmentString);
    }

    public int getEnvironmentInt() {
        return environmentInt;
    }

    public void setEnvironmentInt(int environmentInt) {
        this.environmentInt = environmentInt;
    }

    public String getEnvironmentString() {
        return environmentString;
    }

    public void setEnvironmentString(String environmentString) {
        this.environmentString = environmentString;
    }

    @Override
    public String toString() {
        return "MyOwnPrintln{" +
                "environmentInt=" + environmentInt +
                ", environmentString='" + environmentString + '\'' +
                '}';
    }
}

class main{

    public static void main(String[] args) {

        MyOwnPrintln m=new MyOwnPrintln();
        m.myOwnPrintln(12321);
        m.myOwnPrintln(9.9898);
        m.myOwnPrintln("TLGLearning");
        m.myMethod();
    }


}

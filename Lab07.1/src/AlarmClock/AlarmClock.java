package AlarmClock;

public class AlarmClock {

    int snoozeInterval=99;

    public void setSnoozeInterval(int snoozeInterval){
        int oldValue= this.snoozeInterval;
        this.snoozeInterval=snoozeInterval;
        System.out.println("old = "+oldValue+" new = "+snoozeInterval);
    }

    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    public String toString(){
        //System.out.println(this.getClass().getName());
        return "The Alarm Clock's snooze interval="+ getSnoozeInterval();

    }


}
class main{

    public static void main(String[] args) {
        AlarmClock a=new AlarmClock();
        AlarmClock b=new AlarmClock();
        a.setSnoozeInterval(8);
        System.out.println(a.toString());
        b.setSnoozeInterval(18);
        System.out.println(a.toString());
    }
}

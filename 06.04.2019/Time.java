// Praca w parach: Łukasz Rachwał, Damian Eggert

/*
1.8  Ex: The Time Class
Source: http://www.ntu.edu.sg/home/ehchua/programming/java/J3f_OOPExercises.html
*/

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }

    public Time nextSecond() {
        this.second += 1;
        return this;
    }

    public Time previousSecond() {
        this.second -= 1;
        return this;
    }
    
    public static void main(String[] args) {
        Time time = new Time(10, 12,15);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        time.setHour(15);
        time.setMinute(15);
        time.setSecond(15);
        System.out.println(time);
        time.setTime(20, 20, 20);
        System.out.println(time);
        System.out.println(time.nextSecond());
        System.out.println(time.previousSecond());
    }
}

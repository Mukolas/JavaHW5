package Two;

public class Time {
    private int hour;
    private int min;

    public Time() {
    }

    public Time(int hour, int min) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        }else {
            System.out.println("Error,please set hours value from 0 to 23");
        }
        if (min >= 0 && min <= 59) {
            this.min = min;
        }else {
            System.out.println("Error,please set minutes value from 0 to 59");
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >=0 && hour <= 23) {
            this.hour = hour;
        }
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        if (min >=0 && min <59) {
            this.min = min;
        }
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", min=" + min +
                '}';
    }
}

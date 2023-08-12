package Capter5;

public class Time {
    public int hour1,minute1,hour2,minute2;
    public Time(int hour1,int minute1, int hour2, int minute2)
    {
        this.hour1 = hour1;
        this.minute1 = minute1;
        this.hour2 = hour2;
        this.minute2 = minute2;
    }
    public int CompareTo()
    {
        if(hour1<hour2)
            return -1;
        else if(hour1 == hour2)
        {
            if(minute2>minute1)
                return -1;
            else if(minute1>minute2)
                return 1;
            else
                return 0;
        }
        else
            return 1;
    }

}

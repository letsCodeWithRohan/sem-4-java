/* 2.3 Design a class Time with hours (int) and minutes (int) as data members. 
Include method setTime(int h, int m) to initialize the time and displayTime() to display the time. 
Implement a method addTime(Time t1, Time t2) that takes two Time objects as arguments, adds their hours and minutes, 
and stores the result in the calling object. Do not use constructors for
initialization in this specific practical.*/

class Time {
    private int hours, minutes;
    
    private void setTime(int h, int m){
        this.hours = h;
        this.minutes = m;
    }

    private void displayTime(){
        System.out.println("The Time is " + this.hours + " hours and "+ this.minutes +" minutes");
    }

    private void addTime(Time t1, Time t2){
        this.hours = t1.hours + t2.hours;
        if((t1.minutes + t2.minutes) >= 60 ){
            this.minutes = (t1.minutes + t2.minutes) % 60;
            this.hours += 1;
        }else{
            this.minutes = t1.minutes + t2.minutes;

        }
    }

    public static void main(String[] args){
        Time t1, t2, t3;
        t1 = new Time();
        t2 = new Time();
        t3 = new Time();
        t1.setTime(2,32);
        t1.displayTime();
        t2.setTime(10,32);
        t2.displayTime();
        t3.addTime(t1,t2);
        t3.displayTime();
    }
}
package _04_class_and_object.excercise.stop_watch;

public class StopWatchClass {
    private double startTime;
    private double endTime ;
    public void StopWatchClass(){

    }
    public void start(){
        this.startTime = System.currentTimeMillis();
    }
    public void stop(){
        this.endTime = System.currentTimeMillis();
    }

    public double getStartTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public double getElapsedTime(){
        return getEndTime() - getStartTime();
    }
}

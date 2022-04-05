package _04_class_and_object.excercise.stop_watch;

public class WatchMain {
    public static void main(String[] args) {
        StopWatchClass watch = new StopWatchClass();
        watch.start();
        double [] array = new double[1000000];
        for (int i = 0; i <100000 ; i++) {
            array[i]= Math.random()*1000000;
        }
//        System.out.println(Math.random()*100000);
        for (int j = 0; j < array.length-1 ; j++) {
            if(array[j]>array[j+1]){
                double temp = array[j];
                array[j] = array[j+1];
                array[j+1]= temp;
            }
        }
        watch.stop();
        System.out.println(watch.getElapsedTime());
    }
}

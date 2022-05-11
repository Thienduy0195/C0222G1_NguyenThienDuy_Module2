package added_excercises.excercise2;

import java.util.Comparator;

public class SubjectCompare implements Comparator<Subject> {
    String str = "Lionel Messi, Franz Beckenbauer, Johan Cruyff, Ronaldo Nazario, Cristiano Ronaldo, Zinedine Zidane, Michel Platini, Roberto Baggio, Alfredo Di Stefano";

    @Override
    public int compare(Subject o1, Subject o2) {
        if (o1.getStudyHour() > o2.getStudyHour()) {
            return 1;
        } else if (o1.getStudyHour() < o2.getStudyHour()) {
            return -1;
        } else {
            return 0;
        }
    }
}




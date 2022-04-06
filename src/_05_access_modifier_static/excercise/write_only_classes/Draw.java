package _05_access_modifier_static.excercise.write_only_classes;

public class Draw {
    public static void main(String[] args) {
        String space = " ";
        for (int i = 0; i <6 ; i++) {
            if(i==0){
                continue;
            }
            for(int j=0; j <2*6; j++){
                if((j==6-i) ||(j==6+i)){
                    System.out.print(i);
                } else {
                    System.out.print(space);
                }
            }
            System.out.println();
        }
        for (int i = 4; i >0 ; i--) {
            for(int j=0; j <2*6; j++){
                if((j==6-i) ||(j==6+i)){
                    System.out.print(i);
                } else {
                    System.out.print(space);
                }
            }
            System.out.println();
        }
    }
}

package Human_Resource;

import java.util.Arrays;
import java.util.Collections;

public class Lecturer {
    public static void main(String[] args) {
        Integer[] myNum = {50, 10, 25, 1, 17, 99, 33};

        System.out.println("Before:");
        for (int i : myNum) {
            System.out.println(i);
        }

        Arrays.sort(myNum, Collections.reverseOrder());

        System.out.println("After:");
        for (int i : myNum) {
            System.out.println(i);
        }


        for (int i = 0; i < myNum.length; i++) {
            if (myNum[i] == 17) {
                System.out.println(myNum[i]);
            }
            else{
                System.out.println("Not find");
            }
        }
        int position = Arrays.binarySearch(myNum, 17);
        if(position>-1){
            System.out.println("at index:" +position);
        }
        else{
            System.out.println("in not available");
        }

        System.out.println(position);

    }
}

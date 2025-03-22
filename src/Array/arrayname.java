package Array;

public class arrayname {
    public static void main(String[] args) {

        String[][] university = {{"Cs", "Ba", "mining"}, {"pe", "epe", "6"}};
        String[] university1 = {"1", "2", "3"};

        int[] grades1 = {81, 92, 93};
        int[][] grades = {{91, 82, 73}, {64, 55, 76}};

       /* for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }


        for (int[] i : grades) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }*/

        int i=0;


        do {
            int j = 0;
            do {
                System.out.print(university[i][j] + " ");
                j++;
            } while (j < university[i].length);

            System.out.println();
            i++;
        } while (i < university.length);

    }

}




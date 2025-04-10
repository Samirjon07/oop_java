package Lab_class;

public class Practice {
    public static void main(String[] args) {
        int [][] numbers= new int[2][4];
        for(int i=0;i<=1;i++)
        {
            if (i==0) {
                for (int j = 1; j <= 3; j++) {
                    numbers[i][i] = 1;
                    numbers[i][j] = j * 10;
                }
            }
            else{
                for (int j = 1; j <= 3; j++) {
                    int k=0;
                    numbers[i][k] = 2;
                    numbers[i][j] = numbers[i][j-1]*numbers[k][j];
                }
            }
        }
        for(int i = 0; i < numbers.length; i++)
        {
            for(int j = 0; j < numbers[i].length; j++)
            {
                System.out.print(numbers[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

/*
Output:
1	10	20	30
2	20	400	12000
*/

package Lab_class;

public class Practice2 {
    public static void main(String[] args) {
        int [][] numbers =new int [][]{{1,10,20,30},{2,20,400,12000}};
        ihavedone(numbers);
    }
    static void ihavedone(int [][] numbers){
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

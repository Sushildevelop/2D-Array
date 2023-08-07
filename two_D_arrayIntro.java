package Practice.Array.TwoDArray;

import java.util.Scanner;

public class two_D_arrayIntro {
    public static void main(String[] args) {
        // Declaration
//        int [][] arr= new int[rows][column];


   /*     Multi-dimensional arrays are great at representing grids.
        Advanatages -> input can be taken form user , faster acess and predefined size.

    */

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of rows: ");
        int row=sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int col=sc.nextInt();
        int [][]arr=new int[row][col];
        int total=row*col;
        System.out.println("Please enter "+total+"  elements rows ");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The input array is: ");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class array2DFindTheIndexOfGivenNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int number[][] = new int[rows][cols];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                number[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                if (number[i][j] == x){
                    System.out.println("At found the index of x : (" + i + " " + j + ")");
                }
            }
            System.out.println(" ");
        }



    }
}

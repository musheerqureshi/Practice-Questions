import java.util.Scanner;

public class searchGivenNoAndPrintIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int numbers[] = new int[size];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.println("The value of x : " );
        int x = sc.nextInt();

        for (int i = 0; i <  numbers.length; i++){
            if (numbers[i] == x){
                System.out.println("x found at index : " + i);
            }
        }
    }
}

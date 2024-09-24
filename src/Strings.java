import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        // how to define String
        /**
        //Scanner sc = new Scanner(System.in);
        //String name = sc.nextLine();
        //System.out.println("Your name is " + name);
         **/

        // Concatenation
        /**
       //String firstName = "Musheer";
       //String lastName = "Alam";
       //String fullName = firstName + " " + lastName;
       //System.out.println(fullName.length());
         **/

        // charAt
       /**
        String firstName = "Musheer";
        String lastName = "Alam";
        String fullName = firstName + " " +  lastName;
        System.out.println(fullName.length());

        for (int i = 0; i < fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }
        **/

       // compare Sting
        /**
        //String name1 = "Musheer";
        //String name2 = "Qureshi ";

        // conditions of Comparing String
        // 1. s1 == s2 = 0;
        // 2. s1 > s2 = +ve value;
        // 3. s1 < s2 = -ve value;

        //if (name1.compareTo(name2) == 0){
          //  System.out.println("Strings are equal");
        //}else {
            //System.out.println("Strins are not equal");
        //}
         **/


        //substring
        /**
        String sentence = "My name is Musheer";

       // String name = sentence.substring(11);
       // String name = sentence.substring(11, sentence.length());
        String name = sentence.substring(11, 18);
        System.out.println(name);
         **/


        // StringBuilder
       // StringBuilder sb = new StringBuilder("hello");
       // System.out.println(sb);


        // input in StringBuilder

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);



        // char at index 0
       // System.out.println(sb.charAt(0));

        // set char at index 0
       // sb.setCharAt(0, 'C');
       // System.out.println(sb);

        // insert char
       // sb.insert(5, 'o');
        // System.out.println(sb);

        // delete
        //sb.delete(1,2);
        //System.out.println(sb);

        // append -> means add char in end
       // sb.append("h");
        //sb.append("e");
        //sb.append("l");
        //sb.append("l");
        //sb.append("o");
       // System.out.println(sb);

        /**
        for (int i = 0; i < sb.length()/2; i++){
            int front = i;
            int back = sb.length()-1-i;  // 5-1-0 = 4;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
         **/


        // substring
        /**
        String str = "abcd";

        for (int i = 0; i <=3; i++){
            for (int j = i+1; j <= 4; j++ ){
                System.out.print(str.substring(i, j) + " ");
            }

        }
         **/


    }
}

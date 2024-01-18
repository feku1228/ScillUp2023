package HomeWork;
import java.util.Scanner;
public class HomeWork1 {
    public static void main(String[] args) {
            /*
    Task 1: Palindrome Check
Write a Java program to check if a given string is a palindrome (reads the same backward as forward).
E.g
1) level - it's a palindrome

2) test - not a palindrome
*/

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your words");
        String word = input.nextLine();   //Java
        //0123
        StringBuilder reversedWord = new StringBuilder(); //avaJ

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord.append(word.charAt(i));
        }
//Level ==> leveL

        boolean palindrome = word.equalsIgnoreCase(reversedWord.toString());


        System.out.println(palindrome);
        System.out.println(word);


/*2. Task 2: You need to display the multiplication table for 3 on the screen(System.out.println) using for loop.
e.g
3*1=3
3*2=6
....
3*10=30*/

        System.out.println("Multiplication Table for 3:");

        for (int a = 1; a <= 10; a++) {
            int result = 3 * a;
            System.out.println("3 * " + a + " = " + result);
        }
        /*3. Task 3: The program should display the following sequence on the screen:
7 14 21 28 35 42 49 56 63 70 77 84 91 98
Use for statement*/
        System.out.println("The sequence:");

        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }

        // Adding a new line for better formatting
        System.out.println();


        /*4. Task 4: Reverse String
Write a Java program that takes a string as input and prints its reverse.
*/

        System.out.println("Enter your words");
        String word2 = input.nextLine();   //Java

        for(int i = word2.length()-1; i >= 0; i--){
            System.out.print(word2.charAt(i));
        }

        System.out.println();
        /*5. Task 5: Count Vowels
Create a Java program that counts the number of vowels ( a, e, i, o, u) in a given string.*/
        System.out.println("Enter your words");
        String word3 = input.nextLine();
        word3 = word3.toLowerCase();
        int vowelCount = 0;
        for (int i = 0; i < word3.length(); i++) {
            char ch = word3.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels: +"+vowelCount);
        /*6. Task 6: Extract Digits from a String.
          String = "Orig1inal20"
System.out.println("Alphanumeric String: " + alphanumeric); Original
System.out.println("Extracted Digits: " + digits.toString()); 120 */
        System.out.println("Enter your words");
        String word4 = input.nextLine();   //Java20223
        StringBuilder digits=new StringBuilder();
        StringBuilder letter=new StringBuilder();
        for (int i = 0; i < word4.length(); i++) {
            char ch = word4.charAt(i);

            // Check if the character is a digit
            if (Character.isDigit(ch)) {
              digits.append(ch);
            }
            if (Character.isAlphabetic(ch)){
                letter.append(ch);
            }
        }

        System.out.println("just letters: "+letter);
        System.out.println("Extracted digits: "+ digits);
    }

}
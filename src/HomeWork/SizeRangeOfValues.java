package HomeWork;

import java.util.Arrays;

public class SizeRangeOfValues {
    public static void main(String[] args) {
        // Integer
        int intBySize = Integer.SIZE;
        int intBitSize = Integer.SIZE;
        int intByteSize = Integer.BYTES;
        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println("Size of int: " + intBySize);
        System.out.println("Size of int in Bit: " + intBitSize);
        System.out.println("Size of int in Byte: " + intByteSize);
        System.out.println("Int min value: " + minIntValue);
        System.out.println("Int max value: " + maxIntValue);


        System.out.println();
        //Long
        long longBySize = Long.SIZE;
        long longBitSize = Long.SIZE;
        long longByteSize = Long.BYTES;
        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("Size of Long: " + longBySize);
        System.out.println("Size of Long in Bit: " + longBitSize);
        System.out.println("Size of Long in Byte: " + longByteSize);
        System.out.println("Long min value: " + minLongValue);
        System.out.println("Long max value: " + maxLongValue);

        System.out.println();

        // given a String "Java is a high-level programming language"
        String javaLang = "Java is a high-level, object-oriented programming language";


        // 1. print out string in upper-case
        // <-- code goes here -->
        javaLang = javaLang.toUpperCase();
        System.out.println(javaLang);

        // 2. find and print out length of a string
        // <-- code goes here -->
        System.out.println(javaLang.length());

        // 3. find and print out index of first occurrence of " " (space)
        // <-- code goes here -->
        System.out.println(javaLang.indexOf(" "));

        // 4. find and print out first and last index of occurrence of "-"
        // <-- code goes here -->
        int a1 = javaLang.indexOf("-");         //first index "-"
        int a2 = javaLang.lastIndexOf("-");  //last index"-"
        System.out.println(a1);
        System.out.println(a2);


        // 5. get word "Java" as a substring (using substring() method) and print it out
        // <-- code goes here -->

        String a3 = javaLang.substring(0, 4);
        System.out.println(a3);


        // 6. Declare and initialize new string array (String[]) using result of javaLang.split(" ") method call
        // <-- code goes here -->
        String[] javaLangArray = javaLang.split(" ");
        System.out.println(Arrays.toString(javaLangArray));


        // 7. use loop to print out each element of string array that you got in previous step
        // <-- code goes here -->


        for (String word : javaLangArray) {
            System.out.println(word);
        }
        System.out.println("==========================================================");

        // you have an array with values from -100 to 100
        int[] array100 = new int[201];

        for (int i = 0; i <= 200; i++) {
            array100[i] = i - 100;
        }


        // print out all negative values
        // <-- code goes here -->
        int arrayIndexNegative = 0;
        while (arrayIndexNegative < 100) {
            System.out.println(array100[arrayIndexNegative]);
            arrayIndexNegative++;
        }
        System.out.println("===============================");


        // print out all positive even values
        // <-- code goes here -->
        for (int i = 100; i < array100.length; i++) {
            System.out.println(array100[i]);

        }

        System.out.println("==================================================");

        // print out all array values in single string, comma separated.
        // result should look like -100, -99, -98, -97 ............ 98, 99, 100
        Arrays.sort(array100);
        System.out.println(Arrays.toString(array100));


        // you have two arrays representing minutes and seconds
        int minutes[] = new int[60];
        int seconds[] = new int[60];
        for (int i = 0; i < minutes.length; i++) {
            minutes[i] = i;
            seconds[i] = i;
        }
        // for every even minute and second that can be divided by 20 print out 'time is - ' and value of minutes and seconds
        // output should look like:
        // time is 0:20
        // time is 0:40
        // time is 2:20
        // time is 2:40
        // <-- your code goes here -->
        for (int eachMinute : minutes) {
            if (eachMinute % 20 == 0) {

                for (int eachSecond : seconds) {
                    if (eachSecond % 20 != 0) {
                        continue;
                    }

                    System.out.println("time is " + eachMinute + ":" + eachSecond);

                }
            }
        }


        // you have the following arrays
        String students[] = {"Alice", "Bob", "Peter", "John", "Olivia", "Chris"};
        int grades[][] = {
                {5, 4, 4, 5, 3},//Alice grades  0
                {4, 3, 4, 4, 4},//Bob grades    1
                {5, 5, 5, 5, 3},//Peter         2
                {3, 3, 5, 3, 4},//John          3
                {4, 4, 4, 5, 4},//Olivia        4
                {5, 3, 2, 5, 4},//Chris         5
        };

        // first array contains list of students, second array contains their grades in order how student are listed, so
        // Alice's grades are 5, 4, 4, 5, 3, and John's grades are 3, 3, 5, 3, 4
        // find average grade for each student and print it out in following format
        // Alice avg. = 4.2
        // <-- your code goes here -->
        int length= grades.length;
        double sum = 0;
        for (int i = 0; i <6; i++) {
            for(int j = 0; j <5; j++) {
                double eachNum=grades[i][j];
                sum+=eachNum;
            }
                System.out.print(sum+" summery ");
                double average = sum/length;
                System.out.println("Alice avr.= "+ average);

            }}
        // go through students array and print out name of each student that contains letter 'e'
        // <-- code goes here -->





        // go through students array and print out name of student with the shortest name
        // <-- code goes here -->


        // go through students array and print out name of a student with the longest name
        // <-- code goes here -->
    }
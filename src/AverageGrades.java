public class AverageGrades {

    public static void main(String[] args) {


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
        float sum = 0;
        for (int i = 0; i<6; i++) {     //column
            for (int j = 0; j <5; j++) {     //row
                float eachNum = grades[i][j];
                sum += eachNum;}
                float average = sum / grades.length;{
                for (String eachName : students)

                    System.out.println(eachName + " avr.= " + average);
                }
        }
    }

    }
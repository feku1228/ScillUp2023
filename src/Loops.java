public class Loops {
    public static void main(String[] args) {
        int countOfLaptops = 10;
        while (countOfLaptops > 0) {
            countOfLaptops = countOfLaptops - 1;
            System.out.println("Count of laptops: " + countOfLaptops);
        }
        countOfLaptops++;
        if (countOfLaptops == 0) {
            System.out.println("Need more laptops, current value: " + countOfLaptops);
        } else if (countOfLaptops > 1) {
            System.out.println("We can buy laptops");
        } else {
            System.out.println("Still not enough");
            System.out.println("First line");
        }
        for (int x = 10; x < 20; x++) {
            System.out.println("Value of x: " + x);
        }
        char grade = 'D';
        switch (grade) {
            case 'A':
                System.out.println("Excelent");
                break;
            case 'B':
                System.out.println("Well done!");
                break;
            case 'C':
                System.out.println("You passed!");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Integer quantity = 1;
        Integer updatedQuantity = 2;
        int primitive = 1;
        System.out.println(quantity);
        /*Return max from both arguments*/
        System.out.println(Math.max(quantity, updatedQuantity));
        boolean active = true;
        boolean disabled = false;
        System.out.println(active == disabled);
        /*Characters*/
        char t = 't';
        char e = 'e';
        char s = 's';
        String concated = " ";
        concated = concated + t + e + s + t;
        String test = "test";
        System.out.println("1st: " + concated);
        System.out.println("2d: " + test);
        System.out.println("Compare two strings: " + concated.equalsIgnoreCase(test.toUpperCase()));
        char empty = ' ';
        System.out.println(Character.isWhitespace(empty));
        /*Escape Sequence*/
        System.out.println("Hello \nJava");
        // S = π * r^2

        int r = 50;
        double square = r*r*Math.PI;
        System.out.println(s);
    }
}

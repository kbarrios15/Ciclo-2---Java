import java.util.Scanner;

public class Reto1 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int j67 = lector.nextInt();
        int m15 = (2 * j67) + 4;
        int r99 = (3 * j67 + 4) / 5;
        String categoria;

        if (r99 >= 0 && r99 <= 20) {

            categoria = "uno";
        } else if (r99 >= 21 && r99 <= 40) {
            categoria = "dos";
        } else if (r99 >= 41 && r99 <= 80) {
            categoria = "tres";
        } else {
            categoria = "cuatro";
        }
        System.out.println(j67 + " " + m15 + " " + r99);

        System.out.println(categoria);
    }
}

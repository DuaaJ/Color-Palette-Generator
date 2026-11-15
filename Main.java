import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ColorGenerator generator = new ColorGenerator();

        System.out.println("=== Color Palette Generator ===");

        System.out.println("Available colors: " +
                generator.getAvailableColors());

        String choice;

        do {
            System.out.print("\nEnter a color name: ");
            choice = input.nextLine().trim();

            Color color = generator.getColor(choice);

            if (color == null) {
                System.out.println("Color not found. Try again.");
            } else {
                System.out.println("\nColor: " + color.getName());
                System.out.println("Complementary: " +
                        color.getComplementary());
                System.out.println("Analogous: " +
                        color.getAnalogous());
                System.out.println("Triadic: " +
                        color.getTriadic());
            }

            System.out.print("\nDo you want to try another color? (yes/no): ");

        } while (input.nextLine().equalsIgnoreCase("yes"));

        System.out.println("Thank you for using Color Palette Generator!");

        input.close();
    }
}
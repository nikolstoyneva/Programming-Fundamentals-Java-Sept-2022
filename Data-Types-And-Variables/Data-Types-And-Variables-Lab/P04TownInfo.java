package Data.Types.And.Variables.Lab;

import java.util.Scanner;

public class P04TownInfo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        int population = Integer.parseInt(scanner.nextLine());
        short area = Short.parseShort(scanner.nextLine());

        String result = String.format("Town %s has population of %d and area %d square km.", town, population, area);

        System.out.println(result);
    }
}

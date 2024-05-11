import java.util.Scanner;

public class switchCase {

    public static void main(String[] args){
        System.out.println("Please enter the DAY number:");

        Scanner scanner = new Scanner(System.in);
        int dayNum = scanner.nextInt();
        String day;
        scanner.close();

        day = switch (dayNum%7) {
            case 1 -> "Monday";
            case 2 -> "Tueswday";
            case 3-> "Wednesday";
            case 4-> "Thursday";
            case 5-> "Friday";
            case 6-> "Saturday";
            case 7-> "Sunday";
            default -> "Invalid";
        };
        System.out.println(day);

    }

}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SeasonExample {

    public enum Season {
        WINTER, SPRING, SUMMER, AUTUMN
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a month (e.g., January): ");
        String month = br.readLine().trim().toLowerCase();

        Season season;

        switch (month) {
            case "December":
            case "January":
            case "February":
                season = Season.WINTER;
                break;
            case "March":
            case "April":
            case "May":
                season = Season.SPRING;
                break;
            case "June":
            case "July":
            case "August":
                season = Season.SUMMER;
                break;
            case "September":
            case "October":
            case "November":
                season = Season.AUTUMN;
                break;
            default:
                System.out.println("No this month");
                return;
        }

        System.out.println(month.substring(0, 1).toUpperCase() + month.substring(1) + " is in " + season + ".");
    }
}

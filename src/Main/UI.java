package Main;

public class UI {
    /**
     * @author Iqra Aliya Abbasi
     */

    public static void clear(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void showMainMenu(){
        System.out.println("Main Menu");
        System.out.println("1: Show Member.Member list");
        System.out.println("2: Show Top 5 swim times for specific discipline");
        System.out.println("3: Show Membership fees for all members");
        System.out.println("10: Exit program");
    }

    public static void showDisciplineList(){
        System.out.println("View Top 5 swimmers in one of 4 disciplines");
        System.out.println("Choose discipline:");
        System.out.println("1: Butterfly");
        System.out.println("2: Crawl");
        System.out.println("3: Breaststroke");
        System.out.println("4: Backstroke");
    }

}

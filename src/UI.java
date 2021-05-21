public class UI {

    public static void clear(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void showMainMenu(){
        System.out.println("Main Menu");
        System.out.println("1: Show Member list");
        System.out.println("2: Show Top 5 swim times for specific discipline");
        System.out.println("10: Exit program");
    }

}

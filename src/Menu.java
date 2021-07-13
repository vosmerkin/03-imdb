import java.util.Scanner;

public class Menu {

    public Integer mainMenu(){
        System.out.println("1 - Add entry");
        System.out.println("2 - Delete entry");
        System.out.println("3 - Edit entry");
        System.out.println("4 - Search by name");
        System.out.println("9 - Quit");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        scanner.close();
        return i;



    }
}

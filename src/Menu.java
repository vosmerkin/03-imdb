import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    public void start() {
        Imdb imdb = new Imdb();

        Integer menuItem;
        do {
            menuItem = this.mainMenu();
            ImportExport io = new ImportExport();

            switch (menuItem) {
                case (1):
                    this.addEntry(imdb);

                    break;
                case (2):

                    break;
                case (3):

                    break;
                case (6):
                        io.showOnScreen(imdb.db);
                    break;
                case (7):
                    imdb.db = io.importFromFile("./" + "imdb.txt");
                    break;
                case (8):
                    io.exportToFile("./" + "imdb.txt", imdb.db);
                    break;
                case (9):

                    break;
            }

        }
        while (menuItem != 9);
    }

    public Integer mainMenu() {
        System.out.println("1 - Add entry");
        System.out.println("2 - Delete entry");
        System.out.println("3 - Edit entry");
        System.out.println("4 - Search by name");
        System.out.println("5 - Search by surname");
        System.out.println("6 - Show db on the screen");
        System.out.println("7 - Import from file");
        System.out.println("8 - Export to file");
        System.out.println("9 - Quit");

        //        scanner.close();
        return scanner.nextInt();
    }

    public void addEntry(Imdb imdb) {
//        Scanner scanner = new Scanner(System.in);
        System.out.println("Adding new entry");
        System.out.println("Enter new user name:");
        String name = scanner.next();

        System.out.println("Enter new user surname:");
        String surname = scanner.next();

        System.out.println("Enter user birthdate");
        System.out.println("Year (1900...2021):");
        int year = scanner.nextInt();
        System.out.println("Month(1...12):");
        int month = scanner.nextInt();
        System.out.println("Day(1...31):");
        int day = scanner.nextInt();
        LocalDate birthday = LocalDate.of(year, month, day);

        System.out.println("Enter user address");
        System.out.println("City:");
        String city = scanner.next();
        System.out.println("Street:");
        String street = scanner.next();
//        scanner.close();
        System.out.println("App:");
        int app = scanner.nextInt();

        imdb.addEntry(new User(name, surname, birthday, new Address(city, street, app)));

    }

}

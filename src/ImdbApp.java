public class ImdbApp {


    public static void main(String[] args) {


        //create db
        Imdb imdb = new Imdb();

        //вызываем меню
        Menu menu = new Menu();
        Integer menuItem;
        do {
            menuItem = menu.mainMenu();

            switch (menuItem) {
                case (1): //
                    System.out.println("1 - Add entry");
                        imdb.addEntryManually();
                    break;
                case (2):

                    break;
                case (3):

                    break;
                case (9):

                    break;
            }

        }
        while (menuItem != 9);

    }
}









    }
            }

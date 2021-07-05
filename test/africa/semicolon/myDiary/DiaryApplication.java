package africa.semicolon.myDiary;

import java.util.Scanner;

public class DiaryApplication {
    private static Diary diary = new Diary("My Wahala");

    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        String homepage = """
                1-> Add new Entry
                2-> Delete new Entry
                3-> Find Entry by Title
                4-> Exit

                """;

        System.out.println(homepage);
        int userInput = input.nextInt();
        input.nextLine();
        switch (userInput) {
            case 1:
                System.out.println("What be the entry name");
                String entryName = input.nextLine();
                System.out.println("what be the body");
                String entryBody = input.nextLine();
                diary.addEntry(entryName, entryBody);
                System.out.println("Success");
                main();
            case 2:
                System.out.println("wetin you wan delete");
                String entryTitle = input.nextLine();
                diary.deleteEntryByTitle(entryTitle);
                System.out.println("Success");
                main();
            case 3:
                System.out.println("wetin you dey find");
                entryName = input.nextLine();
                Entry entry = diary.findEntryByTitle(entryName);
                System.out.println(entry);
                main();
            case 4:
                System.out.println("Bye bye");
                System.exit(1);
            default:
                System.out.println("Enter a valid input");
                main();
        }
    }
}

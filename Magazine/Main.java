package Magazine;

import java.util.Scanner;

public class Main {

    public static boolean isNullOrBlank(String inp)
    {
        return (inp == null || inp == "");
    }

    public static boolean incorrectIssueNumber(int isn)
    {
        return isn <= 0;
    }

    public static boolean incorrectPublicationYear(int inp)
    {
        return inp <= 0;
    }

    public static String promptForTitle(Scanner scan)
    {
        while(true)
        {
            System.out.println("Please enter a valid title: ");
            String title = scan.nextLine();
            if(!(isNullOrBlank(title)))
            {
                return title;
            }
        }
    }

    public static String promptForPublisher(Scanner scan)
    {
        while(true)
        {
            System.out.println("Please enter a vaid publisher: ");
            String publisher = scan.nextLine();
            if(!(isNullOrBlank(publisher)))
            {
                return publisher;
            }
        }
    }

    public static int promptForIssueNumber(Scanner scanner) {
        while (true) {
            System.out.println("Please enter a valid issue number (greater than 0): ");
            int issueNumber = scanner.nextInt();
            if(!(incorrectIssueNumber(issueNumber)))
            {
                return issueNumber;
            }
        }
    }

    public static int promptForPublicationYear(Scanner scanner) {
        while (true) {
            System.out.println("Please enter a valid publication year (greater than 0): ");
            int publicationYear = scanner.nextInt();
            if(!(incorrectPublicationYear(publicationYear)))
            {
                return publicationYear;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        String title = promptForTitle(scanner);
        String publisher = promptForPublisher(scanner);
        int issueNumber = promptForIssueNumber(scanner);
        int publicationYear = promptForPublicationYear(scanner);
    
        Magazine newMagazine = new Magazine(title, publisher, issueNumber, publicationYear);
    
        MagazineLibrary library = new MagazineLibrary();
        library.addMagazine(newMagazine);
    
        System.out.println("Magazine added to the library: " + newMagazine.getTitle());
    }
}

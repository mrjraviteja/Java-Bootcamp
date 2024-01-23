import java.util.*;

public class Hangman 
{
    static Scanner scan = new Scanner(System.in);
    public static String[] words = {"ant", "baboon", "badger", "bat", "bear","beaver", "camel", "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer", "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat", "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose", "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal", "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan", "tiger", "toad", "trout", "turkey","turtle", "weasel", "whale", "wolf", "wombat", "zebra"};
    
    public static String[] gallows = {
        "+---+\n" +
        "|   |\n" +
        "    |\n" +
        "    |\n" +   //if the user didn't miss any guesses.
        "    |\n" +
        "    |\n" +
        "=========\n",
       
        "+---+\n" +
        "|   |\n" +
        "O   |\n" +   //if the user missed one guess.
        "    |\n" +
        "    |\n" +
        "    |\n" +
        "=========\n",
         
        "+---+\n" +
        "|   |\n" +
        "O   |\n" +    //if the user missed two guesses.
        "|   |\n" +
        "    |\n" +
        "    |\n" +
        "=========\n",
        
        " +---+\n" +
        " |   |\n" +
        " O   |\n" +   //if the user missed three guesses.
        "/|   |\n" +
        "     |\n" +
        "     |\n" +
        " =========\n",
        
        " +---+\n" +
        " |   |\n" +
        " O   |\n" +
        "/|\\  |\n"+   //if the user missed four guesses.
        "     |\n" +
        "     |\n" +
        " =========\n",
        
        " +---+\n" +
        " |   |\n" +
        " O   |\n" +
        "/|\\  |\n" +  //if the user missed five guesses.
        "/    |\n" +
        "     |\n" +
        " =========\n",
        
        " +---+\n" +
        " |   |\n" +
        " O   |\n" +
        "/|\\  |\n" +   //if the user missed six guesses.
        "/ \\  |\n" +
        "     |\n" +
        " =========\n"};

    public static boolean check(String s,char[] cd)
    {
        String res = cd.toString();
        if(res.equals(s))
        {
            return true;
        }
        else
        {
            return false;
        }
    }   

    public static void main(String args[])
    {
        int len = words.length;
        int strind = (int) (Math.random() * len);
        String s = words[strind];
        int strlen = s.length();
        int cnt = 0;
        char[] dispword = new char[strlen];
        Arrays.fill(dispword,'_');
        char[] misses = new char[strlen];
        Arrays.fill(misses,' ');
        int missind = 0;
        while(cnt < 7)
        {
            System.out.println(gallows[cnt]);
            System.out.print("Words: ");
            for(int i=0;i<strlen;i++)
            {
                System.out.print(dispword[i]+" ");
            }
            System.out.println();
            System.out.println("Misses: ");
            for(int i=0;i<strlen;i++)
            {
                System.out.print(misses[i]+" ");
            }
            System.out.println();
            System.out.println("Guess: ");
            char guess = scan.next().charAt(0);
            int j=0;
            for(j=0;j<strlen;j++)
            {
                if(guess == s.charAt(j))
                {
                    dispword[j] = guess;
                    break;
                }
            }
            if(j==strlen)
            {
                if(misses[missind] == ' ')
                {
                    misses[missind] = guess;
                    missind++;
                }
            }
            if(check(s, dispword))
            {
                System.out.println("You Won!");
                break;
            }
            cnt++;
        }
        if(cnt == 7)
        {
            System.out.println("You Lost the word was: "+s);
        }
    }   
}

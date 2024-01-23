import java.util.Scanner;

public class TicTacToe
{
    static Scanner s = new Scanner(System.in);

    public static void displayBoard(char[][] brd)
    {
        for(int i=0;i<3;i++)
        {
            System.out.println(brd[i][0]+" "+brd[i][1]+" "+brd[i][2]);
        }
    }

    public static int[] askUser(char[][] brd)
    {
        System.out.println("Pick a row and column number: ");
        int row = s.nextInt();
        int col = s.nextInt();
        while(brd[row][col] != '_')
        {
            System.out.println("That row & column is already taken give another: ");
            row = s.nextInt();
            col = s.nextInt();
        }
        return new int[]{row,col};
    }

    public static boolean countRow(char[][] c)
    {
        int cnt = 0;
        int fin = 0;
        for(int i=0;i<3;i++)
        {
            cnt = 0;
            for(int j=0;j<3;j++)
            {
                if(c[i][j] == 'X')
                {
                    cnt++;
                }
            }
            fin = Math.max(fin,cnt);
        }
        return fin == 3;
    }

    public static boolean countCol(char[][] c)
    {
        int cnt = 0;
        int fin = 0;
        for(int i=0;i<3;i++)
        {
            cnt = 0;
            for(int j=0;j<3;j++)
            {
                if(c[j][i] == 'X')
                {
                    cnt++;
                }
            }
            fin = Math.max(fin,cnt);
        }
        return fin == 3;
    }

    public static boolean checkDiag(char[][] c)
    {
        int cnt = 0;
        for(int i=0;i<3;i++)
        {
            if(c[i][i] == 'X')
            {
                cnt++;
            }
        }
        return cnt == 3;
    }

    public static boolean checkOppDiag(char[][] c)
    {
        if(c[0][2] == 'X' && c[1][1] == 'X' && c[2][0] == 'X')
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean checkWin(char[][] brd)
    {
        if(countRow(brd) || countCol(brd) || checkDiag(brd) || checkOppDiag(brd))
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
        char[][] board = {{'_','_','_'},{'_','_','_'},{'_','_','_'}};
        displayBoard(board);
        int i=0;
        for(i=1;i<=9;i++)
        {
            if(i%2 == 0)
            {
                System.out.println("Turn: X");
                int[] spot = askUser(board);
                board[spot[0]][spot[1]] = 'X';
            }
            else
            {
                System.out.println("Turn: O");
                int[] spot = askUser(board);
                board[spot[0]][spot[1]] = 'O';
            }
            displayBoard(board);
            if(checkWin(board))
            {
                System.out.println(" X won the game!");
                break;
            }
        }
        if(i > 9)
        {
            System.out.println("O won the game!");
        }
    }
}
import java.util.Scanner;
public class Tictactoe
{
  public static void main (String args[])
  {
      Scanner sc = new Scanner(System.in);
      char a[]= {'1','2','3','4','5','6','7','8','9'};
      char player='X';
      int pos, c=0,win=0;
      while(c<9 && win==0)
      {
          System.out.println("\n");
          System.out.println(" "+ a[0] + "|" + a[1] + "|" +a[2]);
          System.out.println("---|---|---");
          System.out.println(" "+a[3]+"|"+a[4]+"|"+a[5]);
          System.out.println("---|---|---");
          System.out.println(" "+a[6]+"|"+a[7]+"|"+a[8]);
          System.out.println("Player"+player+",enter position(1-9):");
          pos=sc.nextInt();
          if(pos>=1 && pos<=9)
          {
              if(a[pos-1] != 'X' && a[pos-1] !='O')
              {
                  a[pos-1]=player;
                  c++;
                  if((a[0]==player && a[1]==player && a[2]==player)||(a[3]==player && a[4]==player && a[5]==player)||(a[6]==player && a[7]==player && a[8]==player)||(a[0]==player && a[3]==player && a[6]==player)||(a[1]==player && a[4]==player && a[7]==player)||(a[2]==player && a[5]==player && a[8]==player)||(a[0]==player && a[4]==player && a[8]==player)||(a[2]==player && a[4]==player && a[6]==player))
                  {
                      win=1;
                  }
                  if(win==0)
                  {
                   if(player=='X')
                   player='O';
                   else
                   player='X';
              }
         }
          else
          {
              System.out.println("Position already occupied!");
          }
      }
        else
      {
        System.out.println("Invalid position! Enter between 1 and 9.");
      }
    }
      System.out.println("\nFinal Board:");
      System.out.println(" " + a[0]+"|"+a[1]+"|"+a[2]);
      System.out.println("---|---|---");
      System.out.println(" "+a[3]+"|"+a[4]+"|"+a[5]);
      System.out.println("---|---|---");
      System.out.println(" "+a[6]+"|"+a[7]+"|"+a[8]);
       if(win==1)
       {
         System.out.println("Player" + player + "wins!");
       } 
       else
       { 
           System.out.println("Match Draw!");
        }
           sc.close();
       }
     }


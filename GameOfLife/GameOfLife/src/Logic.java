
public class Logic 
{

    public static void main(String[] args)
    {
      int size = 100;
      
      int [][] board = new int [size][size];
      
      //inicializar la matriz
      for (int i =0; i < size; i++)
      {
            for(int j=0; j < size; j++)
            {
               board [i][j] = Math.random() < 0.5 ? 0 : 1;
            }
            
      }
   
   public static void noToroidal()
   {
     int counter;
     while(true)
     {
       for (int i =0; i < size; i++)
       {
         for(int j=0; j < size; j++)
         {
           if(i < 1)
           {
             if(j<1)
             {
                counter = board [i][j+1] + board [i+1][j] + board[i+1][j+1];
             }
             else
             {
               if ( j > size - 2)
               {
                 counter = board [i][j-1] + board [i+1][j-1]
                 +board [i+1][j];
               }
               else
               {
                 counter = board [i][j-1] + board [i][j+1] + board [i+1][j-1]
                         + board [i+1][j] + board [i+1][j+1];
               }
             }
           }
           else
           {
             if ( i > size - 2)
             {
              if(j < 1)
              {
                counter = board [i-1][j] + board [i-1][j+1] + board [i][j+1];
              }
              else
              {
                   if(j > size-2)
                   {
                     counter = board [i-1] [j-1]+ board [i-1][j] + board [i][j+1];
                   }
               else
               {
                counter= board [i-1][j-1] + board [i-1][j]+ board [i-1][j+1]
                + board [i][j-1] + board [i][j+1];
               }
              }
             }
             else
             {
                if ( j < 1)
                {
                  counter = board [i-1][j] + board [i-1][j+1] +board[i][j+1] +
                            board [i+1][j] + board [i+1][j+1];
                }
                else
                {
                    if(j>size - 2)
                    {
                      counter= board[i-1][j-1] + board[i-1][j] + board [i][j-1]
                               +board [i+1][j-1]+board [i+1][j];
                    }
                    else
                    {
                    counter = board [i-1][j-1] + board [i-1][j]+board[i-1][j+1]
                    +board[i][j-1] + board [i][j+1]+board[i+1][j-1]
                    +board [i+1][j] + board [i+1][j+1];
                    }
                   }
                }
             }
           
             if(board[i][j]==1)
             {
              if(counter < 2 || counter > 3)
                 board [i][j]=0;
             }
             else
             {
               if(counter == 3)
                 board [i][j]=1;
             }
         }
    }
   }
  }
 }
}
 import java.util.Scanner;
 import java.util.Random;
   class NumberGuessingGame {
        public static void main(String[]args)
          {
             Random rand=new Random();
             Scanner scanner = new Scanner(System.in);

             int randomNumber = rand.nextInt(100) +1;
       
                 int tryCount = 0;
                  while(true){
                  System.out.println("ENTER YOUR GUESS B/W =>(1-100)"+ "\n");

                     int playerGuess = scanner.nextInt();
                     tryCount++;
 
                     if(playerGuess == randomNumber){
                          System.out.println("!! CORRECT ANSWER YOU WON !!"+ "\n");
                          System.out.println("IT TOOK YOU " + tryCount +" TRIES TO WIN");
                          break;
                         }
                          else if(randomNumber > playerGuess){
                          System.out.println("NOPE! YOUR NUMBER IS SMALL"+ "\n");
                          }
                         else{
                           System.out.println("NOPE! YOUR NUMBER IS BIG"+ "\n");
                       }
                }
            }
      }

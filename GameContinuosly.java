import java.lang.Math;
import java.util.Scanner;

public class GameContinuosly {
    public static void main(String[] args){

        int userWin = 0;
        int comWin = 0;

        Scanner input = new Scanner(System.in);

        while(true){
            if(userWin + 2 == comWin){
                System.out.println("Computer won more than two time. Winner is computer!");
                break;
            } else if(comWin + 2 == userWin){
                System.out.println("you won more than two times. Winner is you!");
                break;
            }
            int comNum = (int)(Math.random() * 3);
            String comStr = "";
    
            if(comNum == 0){
                comStr = "Scissor";
            } else if(comNum == 1){
                comStr = "Rock";
            } else if(comNum == 2){
                comStr = "Paper";
            }
    
            System.out.print("Scissor[0], Rock[1], Paper[2]\nEnter the your Choice :");
            int userNum = input.nextInt();
            String userStr = "";
            
            if(userNum == 0){
                userStr = "Scissor";
            } else if(userNum == 1){
                userStr = "Rock";
            } else if(userNum == 2){
                userStr = "Paper";
            }

            System.out.println("Computer is " + comStr + "!\nYou are " + userStr + "!");

    
            if(userNum == comNum){
                System.out.println("Draw");
            } else if(userNum == 0 && comNum == 2 || userNum == 1 && comNum == 0 || userNum == 2 && comNum == 1){
                System.out.println("User Win!");
                userWin++;
            } else {
                System.out.println("Computer Win!");
                comWin++;
            }
           
        }

    }    
}

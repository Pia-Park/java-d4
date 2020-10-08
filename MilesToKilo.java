import java.util.Scanner;

public class MilesToKilo {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the starting mile: ");
        int startMile = input.nextInt();
        
        System.out.print("Enter the ending mile: ");
        int endingMile = input.nextInt();

        double kilo = 1.609;

        int startI = startMile;

        while(startI <= endingMile){
            double km = startI * kilo;
            System.out.println("Miles: " + startI + "\t" + "Km: " + km);
            startI += 1;
        }
    }
}
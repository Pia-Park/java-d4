
public class MultiTable {
    public static void main(String[] args){
        System.out.println("\t\t\t   "+"Multiplcation Table");
        for(int t = 1; t <=9; t++){
            for(int l = 1; l<=9; l++){
                System.out.print("-");
            }
        }
        System.out.println();
        for(int i = 1; i <= 9; i++){
            System.out.print(i + " |");
            for(int j = 1; j <= 9; j++){
                System.out.print("\t" + i * j);
            }
            System.out.println();
        }
        
    }

}

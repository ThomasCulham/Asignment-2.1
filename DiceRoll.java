import java.util.Scanner;public class DiceRoll{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        boolean run=true;
        while(run){
            System.out.println("How many dice do you want to roll?");
            int n=sc.nextInt();
            System.out.println("How many sides do these dice have?");
            int s=sc.nextInt();
            random(s,n);

            System.out.println("Would you like to roll again? (y/n)");
            String Ans = sc.next();
            if(Ans.equals("n")||Ans.equals("N")){
                run=false;
            }

        }
    }
    public static void random(int s, int n) {  
        int num = 0;
        while(n>0){
            num=((int)(Math.random()*s)+1);
            n--;

            System.out.print( num + " ");
        }
        System.out.println("");
    }
}
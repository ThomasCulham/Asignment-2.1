import java.util.Scanner;
public class Square{
    public static void main (String[]args){
        int x=0;
        int y=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("What width of cube");
        x=sc.nextInt();
        System.out.println("What height of cube");
        y=sc.nextInt();
        quad(x,y);
    }

    public static void quad(int x, int y) {
        while(y>0){
            for(int i=x; i>0; i--){
                System.out.print("$");
            }
            System.out.println("");
            System.out.println("");
            y--;
        }
    }

}

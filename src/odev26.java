import java.util.Scanner;

public class odev26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, c;

        System.out.println("Girilen Sayilarin EBOB ve EKOK'UNU BULMA \n");
        System.out.print("n1 Sayisini Giriniz : ");
        n1 = input.nextInt();
        System.out.print("n2 Sayisini Giriniz : ");
        n2 = input.nextInt();


        c = n1;
        while (c >= 1) {
            if ((n1 % c == 0) && (n2 % c == 0)){
                System.out.println("ebob : " + c);
                break;
            }else{
                c--;
            }
        }
        System.out.println("ekok : "+(n1*n2/c) );
    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int qtd = sc.nextInt();

        for(int i =0; i < qtd; i++){

        double a = sc.nextLong();
        double b = sc.nextLong();
        int c = (int) (Math.log10(Math.pow(a, b)) +1);

        System.out.println(c);
        }

        sc.close();
    }
}

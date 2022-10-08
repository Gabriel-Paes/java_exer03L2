import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Informe o 1 valor: ");
        int n1 = sc.nextInt();

        System.out.print("Informe o 2 valor: ");
        int n2 = sc.nextInt();

        System.out.print("Informe o 3 valor: ");
        int n3 = sc.nextInt();
        
        sc.close();

        somaValores(n1, n2, n3);
    }
    public static void somaValores(int n1, int n2, int n3){
        int soma = n1+n2+n3;
        System.out.println("A soma é "+soma);
    }
}

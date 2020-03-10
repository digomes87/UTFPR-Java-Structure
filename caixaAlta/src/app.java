import java.util.Scanner;


public class app {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nomeM = entrada.nextLine();

        nomeM = nomeM.toUpperCase();
        System.out.println(nomeM);

    }
}

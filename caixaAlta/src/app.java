import java.util.Scanner;


public class app {
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String args[]){
        caixaAlta();
        contaLetra();
        contaVogal();
        contaConsoantes();
    }

    public static void caixaAlta(){
        System.out.println("Digite seu nome");
        String nomeM = entrada.nextLine();

        nomeM = nomeM.toUpperCase();
        System.out.println(nomeM);
    }

    public static void contaLetra() {
        System.out.println("Digite uma palavra");
        String letras = entrada.nextLine();
        int Nletras = 0;
        for (int i = 1; i < letras.length(); i++) {
            Nletras = i + 1;
        }
        System.out.println(letras + " Possui " + Nletras + " letras");
    }

    public static void contaVogal(){
        System.out.println("Digite uma Palavra: ");
        String qtdVogal = entrada.nextLine();
        int count = 0;
        for(int i=0; i<qtdVogal.length(); i++){
            char ch = qtdVogal.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
                count ++;
            }
        }
        System.out.println("A palavra: "+qtdVogal+ " possui: "+count+ " Vogais");
    }

    public static void contaConsoantes(){
        System.out.println("Digite uma palavra");
        String consoantes = entrada.nextLine();
        int count=0;
        for(int i=0; i<consoantes.length(); i++){
            char ch = consoantes.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){

            }else if(ch != ' '){
                count++;
            }
        }
        System.out.println("A palavra: "+consoantes+" possui: "+count+" consoantes");
    }public static void contaPalavras(){

    }


}

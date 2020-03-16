import java.util.HashMap;
import java.util.Scanner;


public class app {
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String args[]){
//        caixaAlta();
//        contaLetra();
//        contaVogal();
//        contaConsoantes();
//        contaPalavras();
//        diaSemana();
        ////letraRepetida();
        primeiraLetraMaiuscula();


    }
    //1
    public static void caixaAlta(){
        System.out.println("Digite seu nome");
        String nomeM = entrada.nextLine();

        nomeM = nomeM.toUpperCase();
        System.out.println(nomeM);
    }
    //2
    public static void contaLetra() {
        System.out.println("Digite uma palavra");
        String letras = entrada.nextLine();
        int Nletras = 0;
        for (int i = 1; i < letras.length(); i++) {
            Nletras = i + 1;
        }
        System.out.println(letras + " Possui " + Nletras + " letras");
    }
    //3
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
    //4
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
    }
    //5
    public static void contaPalavras(){
        System.out.println("Digite uma frase: ");
        String qtdFrase = entrada.nextLine();
        int count = qtdFrase.split(" ", -1).length- 1;
        System.out.println("Numero de palavras: "+count);

    }
    //6
    // Escreva uma rotina (static) que receba uma String e retorne a contagem de dígitos.

    //7
    public static void diaSemana(){
        System.out.println("Digite um numero de 1 até 7");
        int dia = entrada.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sexta");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }
    }

    //8

    //9
    public static void letraRepetida(){
        HashMap<Character, Integer> map = new HashMap<>();
        System.out.println("Digite uma frase: ");
        String frase = entrada.nextLine();
        int count=0;
        for (int i=0;i<frase.length();i++){
            if(frase.charAt(i)==frase.length()){
                count++;
            }
        }

        System.out.println("Character:  - Quantidade: " + count);

    }
    //10
    public static void primeiraLetraMaiuscula(){
        System.out.print("Digite uma frase: ");
        String line = entrada.nextLine();
        String letra_maiscula = "";
        Scanner lineScan = new Scanner(line);
        while(lineScan.hasNext()) {
            String word = lineScan.next();
            letra_maiscula += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        System.out.println(letra_maiscula.trim());
    }


}

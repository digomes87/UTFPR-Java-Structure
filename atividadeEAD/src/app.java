import java.util.Arrays;
import java.util.Scanner;


public class app {

    public static Scanner entrada = new Scanner(System.in);
    public static void main(String args []){
        //segundos();
        //palavra();
        texto();
        //concatFrase();
    }

    /* 4. Escreva uma rotina de classe (static) ,
    a qual recebe um horário no formato “hh:mm:ss” e retorna o total em segundos.
    Ex: dado “12:03:23” -> o retorno esperado é 43.403s
    Dicas: Use o método ".substring(?,?)" para obter as partes 'hh', 'mm' e 'ss'
    Use o método 'parseInt' da classe 'Integer' para converter de string para inteiro */

    public static void segundos() {
        System.out.println("Digite a hora: ");
        int hora = entrada.nextInt();

        System.out.println("Informe os minutos: ");
        int minuto = entrada.nextInt();

        System.out.println("Informe os segundos: ");
        int segundos = entrada.nextInt();

        System.out.println("Hora informada: " + hora + ":" + minuto + ":" + segundos);

        int totalSegundos = ((hora*3600)+minuto*60)+segundos;

        System.out.println("Total de segundos: "+totalSegundos);
    }

    public static void palavra(){
        /*
        5.Escreva uma rotina de classe (static) ,
            a qual recebe uma palavra e retorna ‘true’ caso seja um PALINDROMO, ou ‘false’  caso contrário.
            Dica: primeiro descubra o que é um PALINDROMO
            Use um  laço 'for' com dois contadores 'i' e 'j' para percorrer a string
            Use o método 'charAt' para buscar o caracter de cada posição
        */
        System.out.println("Digite uma palavra, irei validar se é palindrome ou não");
        String texto = entrada.next();
        String aux = "";
        int i;
        System.out.print("A Palavra: " +texto);
        aux = new StringBuffer(texto).reverse().toString();
        if (texto.equals(aux)) {
            System.out.println("  É palindrome");
        } else {
            System.out.println(" Não é Palindrome");
        }
    }

    public static void texto(){
        /*
        6.Escreva uma rotina de classe (static) que recebe um texto (String) e retorna um array 'int[]'
            com a contagem, de cada uma das letras do alfabeto.
          Exemplo: str = "Hoje temos aula via EAD"
          retorno: [4,0,0,1,3,0,0,1,1,1,0,1,1, 0,2,0,0,0,1,1,1,1,0,0,0,0]
               a,b,c,d,e, f,g,h, i, j,k, l,m,n,o,p,q,r,s, t,u,v,x,y,w,z
          Dicas: use o método 'toLowercase' ou 'toUppercase' para padronizar a string de entrada.
          use o método de classe 'charAt' para pegar o caracter de cada posição na string.
          use uma string "abcdef......" e o método 'indexOf' para encontrar a posição do caractere no array de contagem.
          Inicialize o array de retorno com 'new int[<?tamanho?>]'

          https://www.youtube.com/watch?v=HP-I_WrODTo
        */
        char[] alfabeto = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String frase = "uma nova frase aqui";
        String[] palavra = frase.split(" ");

//        for (int i = 0; i < palavra.length; i++) {
//            char letra[] = new char[1];
//            for (int j = 0; j <palavra.length ; j++) {
//                System.out.println(letra.getChars);
//            }
//        }
        letra = char(alfabeto + 64);
        for (int i = 0; i <alfabeto.length ; i++) {
            System.out.println(alfabeto[i] + " "+i+1);
        }
    }

    public static void concatFrase(){
        /*
        7.Escreva uma rotina que recebe duas FRASES (Strings) e retorna uma frase contendo a intercalação das mesmas,
          palavra por palavra.
            Ex.  fraseA = “Tecnologia Sistemas Internet”,  fraseB = “em para”-> retorno “Tecnologia em Sistemas para Internet”
            Dicas: Use o método ".split" para quebrar as frases em vetores de palavras
            Para concatenar as palavras formando a nova frase, use 'StringBuilder' ou 'StringBuffer'
            (https://www.devmedia.com.br/diferencas-entre-string-stringbuilder-e-stringbuffer-em-java/29865".
        */
        System.out.println("Digite uma frase: ");
        String fraseA = entrada.nextLine();

        System.out.println("Digite outra frase: ");
        String fraseB = entrada.nextLine();

        String[] fA = fraseA.split(" ", 13);
        String[] fB = fraseB.split(" ", 13);

        for (int i=0; i < fA.length; i++){
            System.out.print(fA[i]+' ');
        }

        for (int i = 0; i < fB.length ; i++) {
            System.out.print(fB[i]+ ' ');
        }

    }

}

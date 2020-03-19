import java.util.Scanner;


public class app {

    public static Scanner entrada = new Scanner(System.in);
    public static void main(String args []){
        //segundos();
        //palavra();
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


}

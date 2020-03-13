import java.time.LocalDate;
import java.util.Scanner;

public class exercicios {
    public static Scanner entrada = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("######## Irei descobrir o anos que tu nasceu ########");
        //anoNascimento();
        //media();
        //soma4();
        salario();
    }

    public static void anoNascimento(){
        System.out.println("Digite tua idade: ");
        int idade = entrada.nextInt();
        LocalDate data = LocalDate.now();
        int ano = data.getYear();
        int anoNascimento = ano-idade;
        System.out.println("Tu nasceu no ano de: "+anoNascimento);
    }

    public static void media(){
        double [] num = new double [3];
        int soma = 0;

        for (int i = 0; i < num.length; i++){
            System.out.println("Digite A nota: "+i);
            num[i] = entrada.nextDouble();
        }

        for (int i = 0; i < num.length; i++){
            if (num[i] % 3 == 0) {
                soma = soma + (int)num[i];
            }
        }
        System.out.println("A media é: "+soma);
    }

    public static void soma4(){
        double [] numero = new double[4];
        int somatotal = 0;

        for (int i = 0; i < numero.length; i++) {
            System.out.println("Digite um numero para posição: "+i);
            numero[i] = entrada.nextInt();
        }

        for (int i = 0; i < numero.length ; i++) {
            somatotal = (int) (somatotal+numero[i]);
        }

        System.out.println("Total da Soma dos numeros: "+somatotal);
    }

    public static void salario(){
        int op;
        int meses = 0;
        boolean continua = true;
        float salario = 0;

        while(continua == true){
            System.out.println("Digite a opção desejada: "+ "" +
                                                                "\n 1- Salário" + "" +
                                                                "\n 2- Férias" +
                                                                "\n 3- Décimo terceiro" +
                                                                "\n 4- Sair \n");
            op = entrada.nextInt();

            switch (op){
                case 1:
                    System.out.println("Informe seu salario: ");
                    salario = entrada.nextInt();
                    salario = salario-(salario*11)/100;
                    System.out.println(" O valor do salário descontando os impostas é:" + salario);
                    break;
                case 2:
                    System.out.println("Informe seu salario: ");
                    salario = entrada.nextInt();
                    System.out.println("Quantos meses trabalhados esse ano: ");
                    meses = entrada.nextInt();
                    float ferias = ((salario) / 12 * meses);

                    System.out.println("Tu irá receber de ferias: "+ferias);
                    break;
                case 3:
                    System.out.println("Digite o seu salario: ");
                    salario = entrada.nextFloat();
                    System.out.println("Digite por favor o num de meses: ");
                    meses = entrada.nextInt();
                    float decimoTerceiro = ((salario) / 12 * meses);
                    System.out.println("Tu irá receber "+decimoTerceiro+" de Decimo salário");
                    break;
                case 4:// Sair
                    continua = false;
                    break;
                default:
                    System.out.println("Esta não é uma opção válida!");
            }
        }

    }
}

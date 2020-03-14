import java.time.LocalDate;
import java.util.Scanner;

public class exercicios {
    public static Scanner entrada = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("######## Irei descobrir o anos que tu nasceu ########");
        //anoNascimento();
        //media();
        //soma4();
        //salario();
        //reajusteSalario();
        //triangulo();
        //espetaculo();
        //desconto();
        //quadrado();
        controleIdade();
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

    public static void reajusteSalario(){
        System.out.println("Digite seu salario: ");
        double salario = entrada.nextFloat();
        int reajuste = (int) (salario + ((salario*25)/100));

        System.out.println("Teu reajuste foi de :"+ (reajuste-salario));
    }

    public static void triangulo(){
        double base, altura, areaRetangulo;

        System.out.println("Informe o tamanho da base do triangulo");
        base = entrada.nextDouble();
        System.out.println("Informe a altura do tringulo");
        altura = entrada.nextDouble();

        areaRetangulo = base * altura;

        System.out.println("A area de um retangulo de base = " + base);
        System.out.println("e altura " + altura);
        System.out.println("é " + areaRetangulo);

    }

    public static void espetaculo(){
        /*
            Faça um programa que receba o custo de um espetáculo teatral e o preço do convite
            desse espetáculo. Esse programa deve calcular e mostrar a quantidade de convites que
            devem ser vendidos para que pelo menos o custo do espetáculo seja alcançado.
         */
        double precoEspetaculo, precoConvite = 0;
        int numeroVendasConvite = 0;

        System.out.println("Informe o Valor do Espetáculo:");
        precoEspetaculo = entrada.nextDouble();

        System.out.println("Informe o valor do Convite: ");
        precoConvite = entrada.nextDouble();

        numeroVendasConvite =  (int) (precoEspetaculo/precoConvite);

        System.out.println("Precisa vender "+numeroVendasConvite+" convites para custiar o Evento");
    }

    public static void desconto(){
      /*
      Faça um programa que receba o preço de um produto, calcule e mostre o novo preço,
      sabendo-se que este sofreu um desconto de 10%.
       */
      double precoProduto, desconto, novoPreco = 0;

      System.out.println("Informe o valor do Produto: ");
      precoProduto = entrada.nextDouble();

      desconto = (precoProduto*10)/100;
      novoPreco = precoProduto-desconto;
      System.out.println("Voce recebeu desconto de: "+desconto+" Valor final: "+novoPreco);

    }

    public static void quadrado(){
        /*Faça um programa que calcule e mostre a área de um quadrado.
        Sabe-se que: A = lado * lado.*/
        int quadrado, valor = 0;
        System.out.println("Digite um numero para calcular o lado: ");
        valor = entrada.nextInt();

        quadrado = valor * valor;

        System.out.println("O Quadrado é: "+quadrado);
    }

    public static void controleIdade(){
        int countMenos = 0, countMais = 0, pessoas = 0;
        System.out.println("A idade de quantas Pessoas voce quer validar ?");
        pessoas = entrada.nextInt();

        int idade [] = new int[pessoas];
        int i;
        for (i = 1; i < idade.length; i++) {
            System.out.println("Informe a Idade da Pessoa: ");
            idade[i] = entrada.nextInt();
        }
        for (int t = 0; t < pessoas ; t++) {
            System.out.println(idade[i]);
            if (idade[i] < 18){countMenos = countMenos+1;}
            else if(idade[i] > 50){countMais = countMais + 1;}
            else{
                System.out.println("Ninguem");
            }
        }

        System.out.println("O total de pessoas com menos de 21 anos é: "+countMenos);
        System.out.println("O total de pessoas com mais de 50 anos é: "+countMais);
    }
}

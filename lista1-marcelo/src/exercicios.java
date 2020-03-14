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
        //controleIdade();
        //maiorNumero();
        //maiorDeQuinze();
        //numeroPositivoNegativo();
        //ficha();
        aumento();
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
        int contVinte = 0, countCinquenta = 0, idade = 0 , qtdIdade;
        System.out.println("A idade de quantas Pessoas voce quer validar ?");
        qtdIdade = entrada.nextInt();

        for (int i = 0; i < qtdIdade ; i++) {

            System.out.println("Informe a idade da pessoa: ");
            idade = entrada.nextInt();
            if (idade > 0) {
                if (idade <= 21) {
                    contVinte = contVinte + 1;
                }
                if (idade >= 50) {
                    countCinquenta = countCinquenta + 1;
                }
            }
        }
        System.out.println("Numero de pessoas menores de 21: "+contVinte);
        System.out.println("Numero de pessoas com mais de 50: "+countCinquenta);

    }

    public static void maiorNumero(){
        int num = 0, maior=0, nm=0;

        System.out.println("Informe um numero");
        num = entrada.nextInt();
        System.out.println("Agora voce deve informar "+num+" numeros. Irei conferir qual deles é o maior");

        for (int i = 0; i <= num ; i++) {

            System.out.println("Digite um numero: ");
            maior = entrada.nextInt();
            if(maior > 0){
                if(maior > nm){
                    nm = maior;
                }
            }
        }
        System.out.println("O maior numero é: "+nm);
    }

    public static void maiorDeQuinze(){
        int num = 0, cont=0;

        System.out.println("Informe 15 numeros aleatorios: ");
        for (int i = 0; i <= 15 ; i++) {
            System.out.println("Digit um numero:");
            num = entrada.nextInt();

            if(num > 30){
                cont = cont + 1;
            }
        }

        System.out.println("Da lista de numeros informados "+cont+" sao maiores que 30");
    }

    public static void numeroPositivoNegativo(){
        int numero, i, somapositivo=0, somanegativos=0;

        for (int j = 0; j <20 ; j++) {
            System.out.println("Informe numero positivo ou negativo:");
            numero = entrada.nextInt();

            if(numero >0 ){
                somapositivo = somapositivo+1;
            }else {
                somanegativos = somanegativos + 1;
            }
        }
        System.out.println("Total de numeros negativos: "+somanegativos);
        System.out.println("Total de numeros positivos: "+somapositivo);
    }

    public static void ficha(){
        int repetidor = 3;
        double altura[] = new double[repetidor];
        int cod[] = new int[repetidor];
        double media = 0;
        double maiorAlturaTurma = 0, menorAlturaTurma=0, mediaAlturaTurmaMulher=0;
        for (int i = 0; i < repetidor ; i++) {
            System.out.println("Informe a altura da pessoa:");
            altura[i] = entrada.nextDouble();
            System.out.println("\n 1- Masculino \n 2- Feminino");
            cod[i] = entrada.nextInt();
            if(cod[i]<repetidor){
                if (altura[i] > 0){
                    if(altura[i] < maiorAlturaTurma){
                        menorAlturaTurma = altura[i];
                    }

                    if(altura[i] > maiorAlturaTurma){
                        maiorAlturaTurma = altura[i];
                    }
                }
                if(cod[i] == 2){
                    media = media + altura[i];
                }
            }
        }
        //int aux = (int)mediaAlturaTurmaMulher/repetidor;
        System.out.println("A maior altura da turma: "+maiorAlturaTurma);
        System.out.println("A menor altura da turma: "+menorAlturaTurma);
        System.out.println("A media de altura entre mulheres: "+media);
    }

    public static void aumento(){
        int numFuncionario = 4;
        double salario[] = new double[numFuncionario];
        double salarioReajustado [] = new double[numFuncionario];
        int reajuste [] = new int[numFuncionario];
        String nomeFuncionario [] = new String[numFuncionario];

        System.out.println("########## Iremos recalcular o percentual de aumento para cada funcionario ##########");

        for (int i = 0; i <numFuncionario ; i++) {
            System.out.println("Nome do Funcionario: ");
            nomeFuncionario[i] = entrada.next();

            System.out.println("Informe o salario do funcionario: "+nomeFuncionario[i]);
            salario[i] = entrada.nextDouble();

            if(salario[i] < 200){
                reajuste[i] = ((int) Math.round(salario[i])*13)/100;
            }
            if(salario[i] > 200 && salario[i] < 400){
                reajuste[i] = (int)Math.round(salario[i]*11)/100;
            }
            if(salario[i] > 400 && salario[i]<= 800){
                reajuste[i] = (int)Math.round(salario[i]*9)/100;
            }
            if(salario[i] > 801){
                reajuste[i] = (int)Math.round(salario[i]*7)/100;
            }
        }
        for (int i = 0; i <nomeFuncionario.length ; i++) {
            System.out.println("O funcionario: "+nomeFuncionario[i]);
            System.out.println("Recebeu "+reajuste[i]+" de Reajuste");
            System.out.println("Salario: "+salario[i]+" + Reajuste.");
            System.out.println("Salario reajustado "+(salario[i]+reajuste[i]));
        }
    }
}

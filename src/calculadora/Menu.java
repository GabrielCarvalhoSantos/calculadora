package calculadora;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1, num2, resultado;
        int repetiçao = 0 , operaçao ;
        ArrayList<String> historico = new ArrayList<>();

        Adição somar = new Adição();
        Subtração subtrair = new Subtração();
        Mutiplição mutiplicar = new Mutiplição();
        Divisão dividir = new Divisão();
        Potenciação potenciar = new Potenciação();

        do {
            System.out.println("Informe a operacao desejada: \n" +
                    "\n" +
                    "1 SOMA \n" +
                    "2 SUBTRACAO \n" +
                    "3 MUTIPLICACAO \n" +
                    "4 DIVISAO \n"+
                    "5 POTENCIACAO \n" +
                    "6 SAIR");

            operaçao = input.nextInt();
            if (operaçao == 6){
                break;
            }
            System.out.println("Informe o primeiro valor: ");
            num1 = input.nextDouble();
            System.out.println("Informe o segundo valor: ");
            num2 = input.nextDouble();


            try {
                Validação.validar(num2, operaçao);
                switch (operaçao) {
                    case 1:
                        resultado = somar.ope1(num1, num2);
                        System.out.println(operaçao + " " + " " + num1 + " " + "+"  +" " + num2 + " = " + resultado);
                        historico.add(String.format("%s;%s;%s = %s", num1, num2, 1, resultado));
                        break;

                    case 2:
                        resultado = subtrair.ope1(num1, num2);
                        System.out.println(operaçao + " " + " " + num1 + " " + "+"  +" " + num2 + " = " + resultado);
                        historico.add(String.format("%s;%s;%s = %s", num1, num2, 2, resultado));
                        break;

                    case 3:
                        resultado = mutiplicar.ope1(num1, num2);
                        System.out.println(operaçao + " " + " " + num1 + " " + "+"  +" " + num2 + " = " + resultado);
                        historico.add(String.format("%s;%s;%s = %s", num1, num2, 3, resultado));
                        break;

                    case 4:
                        resultado = dividir.ope1(num1, num2);
                        System.out.println(operaçao + " " + " " + num1 + " " + "+"  +" " + num2 + " = " + resultado);
                        historico.add(String.format("%s;%s;%s = %s", num1, num2, 4, resultado));
                        break;

                    case 5:
                        resultado = potenciar.ope(num1,num2);
                        System.out.println(operaçao + " " + " " + num1 + " " + "+"  +" " + num2 + " = " + resultado);
                        historico.add(String.format("%s;%s;%s = %s", num1, num2, 5, resultado));


                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }


        }while (repetiçao != 2);

        for (String resultadofinal : historico) {
            System.out.println(resultadofinal);
        }
    }
}



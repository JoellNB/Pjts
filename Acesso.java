import java.util.Scanner;

public class Acesso {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        int idade, tempoIdade;
        double altura, alturaCalculada;

        System.out.println("Qual seu nome?");
        nome = entrada.nextLine();

        System.out.println("Qual sua idade?");
        idade = entrada.nextInt();

        System.out.println("Qual sua altura?");
        altura = entrada.nextDouble();

        System.out.println("Olá " + nome + "!");

        tempoIdade = 50 - idade;
        System.out.println("Em " + tempoIdade + "anos, você terá 50 anos");

        alturaCalculada = altura * 100;
        System.out.println("Sua altura em cm é: " + alturaCalculada + "cm");

        entrada.close();
    }
}
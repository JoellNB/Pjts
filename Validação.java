import java.util.Scanner;

public class Validação {
    public static void main(String[] args) {

        String senha;
        Boolean acesso = false;
        Scanner entrada = new Scanner(System.in);

        do{

            System.out.println("Digite sua senha: ");
            senha = entrada.nextLine();

            if (senha.equals("Hot Asked")) {
                System.out.println("Acesso permitido");
                acesso = true;
            }else{
                System.out.println("SENHA INCORRETA!");
                System.out.println("Tente novamente");
            }
        }while (acesso == false);

        System.out.println("Seja bem vindo!");

        entrada.close();
    }


}


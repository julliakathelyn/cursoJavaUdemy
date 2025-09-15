import java.util.Scanner;

public class Console {
    public static void main(String[] args) throws Exception {

        System.out.print("Bom");
        System.out.print(" dia\n\n");

        System.out.println("Bom");
        System.out.println("dia");
        
        System.out.printf("megasena:%d %d %d %d %d %d\n", 1,2,3,4,5,6);
        System.out.printf("Salario: %.1f\n", 1234.5678);
        System.out.printf("Nome: %s%n", "João");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        String nome = entrada.nextLine();

        System.out.println("Digite o seu sobrenome:");
        String sobrenome = entrada.nextLine();

        System.out.println("Digite sua idade:");
        int idade = entrada.nextInt();

        System.out.println("O salario é:");
        double salario = entrada.nextDouble();


        System.out.println("Voce esta trabalhando? Resposta: true or false");
        boolean Verdadeiro = entrada.nextBoolean();

        System.out.println("Nome =" + nome + " "+ sobrenome + " Idade :"+ idade + " O salario é : "+ salario+ " Tem emprego?"+ Verdadeiro);

        entrada.close();

        
    }
}

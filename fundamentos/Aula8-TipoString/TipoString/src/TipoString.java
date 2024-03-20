public class TipoString {
    public static void main(String[] args) throws Exception {

        System.out.println("Ola amigos!".charAt(4));// metodo charAt vai mostrar qual a letra na posição ()

        // a string é um objeto imudavel
        String s = "Boa tarde galera";
        s = s.toUpperCase(); // nesse caso voce nao esta modificando o valor dentro da letra s , voce esta
                             // substituindo o valor q esta na letra s

        // s = "Bom dia"; // aqui o valor esta sendo completamente modificado
        System.out.println(s.concat("!!!!!")); // concatena
        System.out.println(s + "!!!!!!!!!!!!!!!!");
        System.out.println(s.startsWith("Boa"));// começa com ?
        System.out.println(s.startsWith("BOA"));
        System.out.println(s.length()); // quantos caracteres tem
        System.out.println(s.endsWith("galera"));// termina com ?
        System.out.println(s.endsWith("!!!!!!!!!!!!!!!!"));
        System.out.println(s.endsWith("!!!!!"));
        System.out.println(s.endsWith("GALERA"));
        System.out.println(s.equals("boa tarde"));// compara se é igual
        System.out.println(s.equals("BOA TARDE GALERA"));
        System.out.println(s.equalsIgnoreCase("Boa tarde galera"));// compara se é igual ignorando se é maiusculo ou
                                                                   // minusculo

        var nome = "Jullia";
        var sobrenome = "Kathelyn";
        var idade = 20;
        var salario = 12345.678;

        System.out
                .println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario);

        System.out.printf("A senhora %s %s tem %d e ganha %.2f de salario ", nome, sobrenome, idade, salario);

        // o printf é um meio de deixar menos extenso com tantas concatenações...
        // Para cada 'por cento' alguma coisa (como o s de string), é para ser
        // substituído com com a possível concatenação que você faria

        String frase = String.format("\nA senhora %s %s tem %d e ganha %.2f de salario ", nome, sobrenome, idade,
                salario);
        System.out.println(frase); // essa é outra maneira de formatar uma frase


        String outra = "Frase qualquer";
        System.out.println(outra.contains("qual"));// contem a frase qual ?

        System.out.println(outra.substring(6));// pega a partir do carctere 6 

    }
}

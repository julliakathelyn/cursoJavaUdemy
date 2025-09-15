public class TiposPrimitivos {
    public static void main(String[] args) throws Exception {
        
 
        //informaçoes do funcionario para exemplificar os tipos primitivos

        //tipos numericos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 50000;
        long pontosAcumulados = 3_134_800_200L;

        //Tipos numericos reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        //Tipo booleano
        boolean estaDeFerias = false;

        //Tipo caractere
        char status = 'a';

        // Dias de empresa 
        System.out.println("Quantos dias o funcionario esta na empresa: " + anosDeEmpresa * 365);

        //numeros de viagens 
        System.out.println("O funcinario foi e voltou : " + numeroDeVoos / 2);

        // pontos acumulados por real
        System.out.println("Pontos acumulados por real: " + pontosAcumulados / vendasAcumuladas);

        System.out.println("O id " + id +" ganha: "+ salario);
        System.out.println("Ferias??? " + estaDeFerias);
        System.out.println("Status: " + status);




    }
}

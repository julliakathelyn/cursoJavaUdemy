import java.util.Scanner;

public class Wrappers {
    public static void main(String[] args) throws Exception {
        //wraper = embrulho
        // São classe que empacotam tipos primitivos em objetos.
        //byte

        Scanner entrada = new Scanner(System.in);

        Byte b = 100; // byte
        Short s = 1000; //short
        //Integer i = 10000; // int
        Long l = 100000L; // o long precisa do L
        Integer i = Integer.parseInt(entrada.next());


            System.out.println(b.byteValue());
            System.out.println(s.toString());
            System.out.println(i * 123);
            System.out.println(l / 3);


            // converteu um string para um boolean
            Boolean bo = Boolean.parseBoolean("true");
            System.out.println(bo);
            //converteu um boolean para string e colocou em letra maiuscula
            System.out.println(bo.toString().toUpperCase());

            Character c = '#';
            //converter caracter para string
            System.out.println(c + "...");

            Float f = 123.10F;
            System.out.println(f);

            Double d = 1234.5678;
            System.out.println(d);

            entrada.close();

    }
}

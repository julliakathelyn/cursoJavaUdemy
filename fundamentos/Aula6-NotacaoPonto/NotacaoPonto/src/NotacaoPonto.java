public class NotacaoPonto {
    public static void main(String[] args) throws Exception {
        
        String s = "Bom dia X";

        s.toUpperCase(); //nao fara ficar maiusculo

        System.out.println(s);

        s = s.toUpperCase(); //fara ficar maiusculo
        System.out.println(s);

        s = s.replace("X", "Senhora");
        s = s.concat("!!!!!!"); // metodo igual ao +
        System.out.println(s);

        System.out.println("Jullia".toUpperCase()); // mesmo o metodo nao estar armazenado em uma variavel é possivel utilizado-lo

        String y = "Bom dia X".replace("X", "Jullia").toUpperCase().concat("!!!!!!!!!!!!!!!!!"); // nesse caso como o resultado de cada metodo é uma string nos podemos utilizar varios motodos seguidos porem se nessa sequencia tivesse um metodo que retornasse um int por exemplo  quebraria a sequencia logica
        System.out.println(y);

        // tipo primitivos nao tem o operador "."


    }
}

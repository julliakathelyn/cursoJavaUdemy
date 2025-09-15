public class AreaCircunferencia {
    public static void main(String[] args)  {
        double raio = 3.4;
        final double PI = 3.14159; // final deixa a variavel que nesse caso é uma constante nao poder ser alterada em outra hora dentro do codigo

        System.out.println(PI * raio * raio);

        System.out.println("tambem é possivel fazer isso de outra maneira");
        
        //double raio = 3.4;
        //double pi = 3.14159;
        double area = PI * raio * raio; //nesse caso area vai receber a conta

        System.out.println(area);// vai mostrar o resultado de area 

        raio = 10;
        area = PI * raio * raio;
        System.out.println("Area = " + area);

    }
}

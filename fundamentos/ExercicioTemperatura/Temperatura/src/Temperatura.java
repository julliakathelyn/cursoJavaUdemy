public class Temperatura {
    public static void main(String[] args) throws Exception {
        
        final double ajuste = 32;
        final double fator = 5/9.0;
        double Fahrenheit = 86; // aqui definimos um valor para Fahrenheit

        double Celsius = ((Fahrenheit - ajuste) * fator); //formula

        System.out.println("o resultado é: " + Celsius + " C");

        Fahrenheit = 150;
        Celsius = ((Fahrenheit - ajuste) * fator);

        System.out.println("o resultado é: " + Celsius + " C");
        





    }
}

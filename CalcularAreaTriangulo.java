package calcularAreaTriangulo;

import java.util.Scanner;

public class CalcularAreaTriangulo {
    public static void main(String[] args) {
        // formula area = raiz quadrada de p(p - a)(p - b)(p - c)   onde p = a+b+c/2

        Scanner sc = new Scanner(System.in);
        Triangle x = new Triangle();
        Triangle y = new Triangle();

        System.out.println("Digite os valores do triangulo X ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Digite os valores do triangulo Y ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area(); // Usamos o .area para que o objeto chame o método que calcula a area e assim a variavel areaX receba o valor do calculo
        double areaY = y.area();
        System.out.println("Area do triângulo X "+ areaX);
        System.out.println("Area do triângulo Y "+ areaY);



    }


}

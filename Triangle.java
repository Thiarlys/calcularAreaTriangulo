package calcularAreaTriangulo;

public class Triangle {
    double a;
    double b;
    double c;

    public double area() {
        double pX= (a + b + c) / 2.0;
        return Math.sqrt(pX * (pX - a) * (pX - b) * (pX - c)); // Aqui usamos o return para retornar o valor do calculo
    }
}

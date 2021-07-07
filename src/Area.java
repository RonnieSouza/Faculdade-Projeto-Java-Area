import java.util.Scanner;

public class Area {

    String forma;
    double baseMenor, baseMaior, altura;

    public void setForma (String f) {
        if (!f.isEmpty()) {
            forma = f;
        }
    }

    public String getForma() {
        return forma;
    }

    public void setBaseMenor (double bm) {
        if (bm > 0) {
            baseMenor = bm;
        }
    }

    public  double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMaior (double bm) {
        if (bm > 0) {
            baseMaior = bm;
        }
    }

    public double getBaseMaior() {
        return baseMaior;
    }

    public void setAltura (double a) {
        if (a > 0) {
            altura = a;
        }
    }

    public double getAltura() {
        return altura;
    }

    // entra dados
    public void entraDadosQuadrado() {
        Scanner entrada = new Scanner( System.in );
        System.out.println("----------------------------------");
        System.out.println("Digite a forma que deseja calcular a area: ");
        setForma( entrada.nextLine());
        System.out.println("Digite o tamanho do lado: ");
        setBaseMenor(Double.parseDouble(entrada.nextLine()));
        System.out.println("----------------------------------");

    }

    public void entraDadosRetanguro() {
        Scanner entrada = new Scanner( System.in );
        System.out.println("----------------------------------");
        System.out.println("Digite a forma que deseja calcular a area: ");
        setForma( entrada.nextLine());
        System.out.println("Digite o tamanho do lado menor: ");
        setBaseMenor(Double.parseDouble(entrada.nextLine()));
        System.out.println("Digite o tamanho do lado maior: ");
        setBaseMaior(Double.parseDouble(entrada.nextLine()));
        System.out.println("----------------------------------");

    }

    public void entraDadosTrapezio() {
        Scanner entrada = new Scanner( System.in );
        System.out.println("----------------------------------");
        System.out.println("Digite a forma que deseja calcular a area: ");
        setForma( entrada.nextLine());
        System.out.println("Digite o tamanho do lado menor: ");
        setBaseMenor(Double.parseDouble(entrada.nextLine()));
        System.out.println("Digite o tamanho do lado maior: ");
        setBaseMaior(Double.parseDouble(entrada.nextLine()));
        System.out.println("Digite o tamanho da altura: ");
        setAltura(Double.parseDouble(entrada.nextLine()));
        System.out.println("----------------------------------");

    }

    // imprimir os dados
    public void imprimirQuadrado() {
        System.out.println("----------------------------------");
        System.out.println("Forma: " + getForma());
        System.out.println("Lado: " + getBaseMenor());
        System.out.println("Area calculada: " + calculaArea(getBaseMenor()));
        System.out.println("----------------------------------");
    }

    public void imprimirRetangulo() {
        System.out.println("----------------------------------");
        System.out.println("Forma: " + getForma());
        System.out.println("Lado Menor: " + getBaseMenor());
        System.out.println("Lado Maior: " + getBaseMaior());
        System.out.println("Area calculada: " + calculaArea(getBaseMenor(), getBaseMaior()));
        System.out.println("----------------------------------");
    }

    public void imprimirTrapezio() {
        System.out.println("----------------------------------");
        System.out.println("Forma: " + getForma());
        System.out.println("Lado Menor: " + getBaseMenor());
        System.out.println("Lado Maior: " + getBaseMaior());
        System.out.println("Altura: " + getAltura());
        System.out.println("Area calculada: " + calculaArea(getBaseMenor(), getBaseMaior(), getAltura()));
        System.out.println("----------------------------------");
    }

    public double calculaArea (double bMenor) {
        double resultado;
        resultado = bMenor * bMenor;
        return resultado;
    }

    public double calculaArea (double bMenor, double bMaior) {
        double resultado;
        resultado = bMenor * bMaior;
        return resultado;
    }

    public double calculaArea (double bMenor, double bMaior, double alt) {
        double resultado;
        resultado = (bMenor + bMaior) * alt/2;
        return resultado;
    }

}

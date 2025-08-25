package Retangulo;

public class Retangulo {

    private double altura;
    private double largura;

    private String errorMsgValorInvalido = "Valor inválido. Informe um valor entre 0 e 20";

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura < 0 || altura > 20) {
            System.out.println(errorMsgValorInvalido);
        } else {
            this.altura = altura;
        }
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura < 0 || largura > 20) {
            System.out.println(errorMsgValorInvalido);
        } else {
            this.largura = largura;
        }
    }

    public void calcularArea(double altura, double largura) {
        System.out.println(altura * largura);
    }

    public void calcularPerimetro(double altura, double largura) {
        System.out.println((altura * 2) + (largura * 2));
    }

}

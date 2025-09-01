package main.java.RetanguloTeste;

import Retangulo.Retangulo;

public class RetanguloExecutar {

    public static void main(String[] args) {

        Retangulo ret1 = new Retangulo();

        ret1.setAltura(5);
        ret1.setLargura(3);

        System.out.println(ret1.getAltura());
        System.out.println(ret1.getLargura());
        ret1.calcularArea(ret1.getAltura(), ret1.getLargura());
        ret1.calcularPerimetro(ret1.getAltura(), ret1.getLargura());
    }
}

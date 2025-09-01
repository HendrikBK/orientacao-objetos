package exer02;

import exer02.tempo;

public class tempoExecutar {
    public static void main(String[] args) {
        tempo t = new tempo();

        t.setHoras(12);
        t.setMinutos(43);
        t.setSegundos(45);

        t.mostrarTempo();

        t.mostrarTempoEmSegundos(t.getTotalSegundos());

        t.incrementarSegundos(15);

        t.conversao(t.getTotalSegundos());

        t.mostrarTempoEmSegundos(t.getTotalSegundos());

        t.mostrarTempo();

    }
}

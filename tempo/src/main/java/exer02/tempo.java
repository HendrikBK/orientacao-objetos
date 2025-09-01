package exer02;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class tempo {

    private int horas;
    private int minutos;
    private int segundos;
    private int totalSegundos;

    private final int MAXIMO = (24 * 60 * 60) - 1;

    private final String errorMsgValorInvalido = "Valor inválido.";

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        if (horas < 0 || horas >= 24) {
            System.out.println(errorMsgValorInvalido);
        } else {
            this.horas = horas;
            totalSegundos += horas * 60 * 60;
        }
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if (minutos < 0 || minutos > 59) {
            System.out.println(errorMsgValorInvalido);
        } else {
            this.minutos = minutos;
            totalSegundos += minutos * 60;
        }
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if (segundos < 0 || segundos > 59) {
            System.out.println(errorMsgValorInvalido);
        } else {
            this.segundos = segundos;
            totalSegundos += segundos;
        }
    }

    public void mostrarTempo() {
        System.out.println("Tempo: " + String.format("%02d", horas) + ":" + String.format("%02d", minutos) + ":" + String.format("%02d", segundos));
    }

    /* Converter tempo em  segundos */

    public int getTotalSegundos() {
        return totalSegundos;
    }

    public void mostrarTempoEmSegundos(int totalSegundos) {
        System.out.println(totalSegundos + " segundos decorridos após a meia-noite");
    }

    /* Converter segundos em horas */

    public void conversao(int totalSegundos) {
        if (totalSegundos >= 3600) {
            horas = totalSegundos / 3600;
            minutos = (totalSegundos %  3600) / 60;
            segundos = totalSegundos % 3600 % 60;
        } else if (totalSegundos >= 60) {
            horas = 0;
            minutos = totalSegundos / 60;
            segundos = totalSegundos % 60;
        } else {
            horas = 0;
            minutos = 0;
            segundos = totalSegundos;
        }
    }

    /* Incrementar horas, minutos e segundos */

    public void incrementarSegundos(int segundosExtras) {
        if (totalSegundos + segundosExtras >= MAXIMO) {
            System.out.println(errorMsgValorInvalido);
        } else {
            totalSegundos += segundosExtras;
        }
    }
}

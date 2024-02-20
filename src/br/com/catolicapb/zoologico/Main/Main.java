package br.com.catolicapb.zoologico.Main;

import br.com.catolicapb.zoologico.Model.Animal.*;
import br.com.catolicapb.zoologico.Model.Habitat.*;
import br.com.catolicapb.zoologico.Model.Util.Zoologico;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico();
        zoo.horarioDeAbertura = LocalTime.of(7, 30);
        zoo.horarioDeEncerramento = LocalTime.of(16, 30);

        zoo.habitatBambu[0] = new HabitatBambu();
        zoo.habitatBambu[0].pandas[0] = new Panda();
        zoo.habitatBambu[0].pandas[1] = new Panda();
        System.out.printf("%s\n", zoo.habitatBambu[0].pandas[0]);
        System.out.printf("%s\n", zoo.habitatBambu[0].pandas[1]);

        zoo.habitatFonte[0] = new HabitatFonte();
        zoo.habitatFonte[0].elefantes[0] = new Elefante();
        zoo.habitatFonte[0].elefantes[1] = new Elefante();
        System.out.printf("%s\n", zoo.habitatFonte[0].elefantes[0]);
        System.out.printf("%s\n", zoo.habitatFonte[0].elefantes[1]);

        zoo.habitatGelo[0] = new HabitatGelo();
        zoo.habitatGelo[0].pinguins[0] = new Pinguim();
        zoo.habitatGelo[0].pinguins[1] = new Pinguim();
        zoo.habitatGelo[0].pinguins[2] = new Pinguim();
        System.out.printf("%s\n", zoo.habitatGelo[0].pinguins[0]);
        System.out.printf("%s\n", zoo.habitatGelo[0].pinguins[1]);
        System.out.printf("%s\n", zoo.habitatGelo[0].pinguins[2]);

        zoo.habitatSelva[0] = new HabitatSelva();
        zoo.habitatSelva[0].leoes[0] = new Leao();
        zoo.habitatSelva[0].leoes[1] = new Leao();
        zoo.habitatSelva[0].leoes[2] = new Leao();
        System.out.printf("%s\n", zoo.habitatSelva[0].leoes[0]);
        System.out.printf("%s\n", zoo.habitatSelva[0].leoes[1]);
        System.out.printf("%s\n", zoo.habitatSelva[0].leoes[2]);

        zoo.habitatSelva[1] = new HabitatSelva();
        zoo.habitatSelva[1].girafas[0] = new Girafa();
        zoo.habitatSelva[1].girafas[1] = new Girafa();
        zoo.habitatSelva[1].girafas[2] = new Girafa();
        System.out.printf("%s\n", zoo.habitatSelva[1].girafas[0]);
        System.out.printf("%s\n", zoo.habitatSelva[1].girafas[1]);
        System.out.printf("%s\n", zoo.habitatSelva[1].girafas[2]);

        zoo.habitatSelva[2] = new HabitatSelva();
        zoo.habitatSelva[2].zebras[0] = new Zebra();
        zoo.habitatSelva[2].zebras[1] = new Zebra();
        System.out.printf("%s\n", zoo.habitatSelva[2].zebras[0]);
        System.out.printf("%s\n", zoo.habitatSelva[2].zebras[1]);

        zoo.habitatTropical[0] = new HabitatTropical();
        zoo.habitatTropical[0].macacos[0] = new Macaco();
        zoo.habitatTropical[0].macacos[1] = new Macaco();
        zoo.habitatTropical[0].macacos[2] = new Macaco();
        System.out.printf("%s\n", zoo.habitatTropical[0].macacos[0]);
        System.out.printf("%s\n", zoo.habitatTropical[0].macacos[1]);
        System.out.printf("%s\n", zoo.habitatTropical[0].macacos[2]);
    }
}

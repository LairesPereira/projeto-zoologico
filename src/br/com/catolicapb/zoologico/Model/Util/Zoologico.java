package br.com.catolicapb.zoologico.Model.Util;

import br.com.catolicapb.zoologico.Model.Habitat.*;

import java.time.LocalTime;

public class Zoologico {
    public LocalTime horarioDeAbertura;
    public LocalTime horarioDeEncerramento;

    public HabitatGelo[] habitatGelo = new HabitatGelo[1];
    public HabitatBambu[] habitatBambu = new HabitatBambu[1];
    public HabitatFonte[] habitatFonte = new HabitatFonte[1];
    public HabitatSelva[] habitatSelva = new HabitatSelva[3];
    public HabitatTropical[] habitatTropical = new HabitatTropical[1];
}

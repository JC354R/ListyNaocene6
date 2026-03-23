package com.example.listy;

public class Produkt {
    private String nazwa;
    private double cena;
    private boolean czyKupione;

//konstruktor
    public Produkt(String nazwa, double cena, boolean czyKupione) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.czyKupione = czyKupione;
    }

    @Override
    public String toString() {

        if(czyKupione){
            return "nazwa: " + nazwa + '\n' + ", Cena: " + cena + ", kupione";
        }else{
            return "nazwa: " + nazwa + '\n' + ", Cena: " + cena ;
        }
    }

    public void odwroc(){
        czyKupione = !czyKupione;
    }

    //getter
    public String getNazwa() {
        return nazwa;
    }

    public double getCena() {
        return cena;
    }

    public boolean isCzyKupione() {
        return czyKupione;
    }


    //setter
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public void setCzyKupione(boolean czyKupione) {
        this.czyKupione = false;
    }
}

package pl.pasieka.enums;

public enum SkalaSzkolna {

    BARDZO_MALA(1),
    MALA(2),
    SREDNIA(3),
    DUZA(4),
    BARDZO_DUZA(5);

    private int wartosc;

    SkalaSzkolna(int wartosc) {
        this.wartosc = wartosc;
    }
}

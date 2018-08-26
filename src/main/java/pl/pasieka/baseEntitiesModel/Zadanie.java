package pl.pasieka.baseEntitiesModel;

import pl.pasieka.enums.SkalaSzkolna;
import pl.pasieka.enums.StanZadania;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.Instant;

@MappedSuperclass
public abstract class Zadanie implements Serializable {

    private String opisZadania;

    private SkalaSzkolna pracochlonnosc;

    private Instant czasZakonczenia;

    private StanZadania stanZadania;


}

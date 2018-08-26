package pl.pasieka.model.baseEntitiesModel;

import pl.pasieka.model.enums.SkalaSzkolna;
import pl.pasieka.model.enums.StanZadania;

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

package pl.pasieka.model.baseEntitiesModel;

import pl.pasieka.model.audit.DateUserAudit;
import pl.pasieka.model.enums.SkalaSzkolna;
import pl.pasieka.model.enums.StanZadania;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.Instant;

@MappedSuperclass
public abstract class Zadanie extends DateUserAudit implements Serializable {

    private String opisZadania;

    private SkalaSzkolna pracochlonnosc;

    private Instant czasZakonczenia;

    @Enumerated(EnumType.STRING)
    private StanZadania stanZadania;

}

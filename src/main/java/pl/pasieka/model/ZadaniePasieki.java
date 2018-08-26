package pl.pasieka.model;

import lombok.Getter;
import lombok.Setter;
import pl.pasieka.baseEntitiesModel.Zadanie;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "zadanie_pasieki")
@Entity
public class ZadaniePasieki extends Zadanie {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "zad_pasieki_generator")
    @SequenceGenerator(name="zad_pasieki_generator", sequenceName = "zad_pas_seq", allocationSize=50)
    @Column(name = "id", updatable = false, nullable = false)
    private int id;

    @ManyToOne
    @JoinColumn(name = "pasieka_id")
    private Pasieka pasieka;

}

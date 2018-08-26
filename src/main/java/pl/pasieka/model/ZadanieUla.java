package pl.pasieka.model;

import lombok.Getter;
import lombok.Setter;
import pl.pasieka.model.baseEntitiesModel.Zadanie;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "zadanie_ula")
@Entity
public class ZadanieUla extends Zadanie {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "zad_ula_generator")
    @SequenceGenerator(name="zad_ula_generator", sequenceName = "zad_ul_seq", allocationSize=50)
    @Column(name = "id", updatable = false, nullable = false)
    private int id;

    @ManyToOne
    @JoinColumn(name = "ul_id")
    private Ul ul;
}

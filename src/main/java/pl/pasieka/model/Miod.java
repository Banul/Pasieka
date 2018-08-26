package pl.pasieka.model;

import lombok.Getter;
import lombok.Setter;
import pl.pasieka.enums.RodzajeMiodu;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "miod")
public class Miod {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "miod_generator")
    @SequenceGenerator(name="miod_generator", sequenceName = "miod_seq", allocationSize=50)
    @Column(name = "id", updatable = false, nullable = false)
    private int id;

    private RodzajeMiodu rodzajeMiodu;

    private double iloscWydobytegoMiodu;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "przeglad_id")
    private Przeglad przeglad;
}

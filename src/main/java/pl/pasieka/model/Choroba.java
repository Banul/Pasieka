package pl.pasieka.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "choroba")
public class Choroba {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "choroba_generator")
    @SequenceGenerator(name="choroba_generator", sequenceName = "choroba_seq", allocationSize=50)
    @Column(name = "id", updatable = false, nullable = false)
    private int id;

    @ManyToOne
    @JoinColumn(name = "przeglad_id")
    private Przeglad przeglad;

    private String opisChoroby;

    private String podjeteDzialania;
}

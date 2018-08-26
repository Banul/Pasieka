package pl.pasieka.model;

import lombok.Getter;
import lombok.Setter;
import pl.pasieka.model.enums.PlodnoscMatki;

import javax.persistence.*;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "matka")
public class Matka {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "matka_generator")
    @SequenceGenerator(name="matka_generator", sequenceName = "matka_seq", allocationSize=50)
    @Column(name = "id", updatable = false, nullable = false)
    private int id;

    @OneToOne
    @JoinColumn(name = "ul_id")
    private Ul ul;

    private Instant rokWlozenia;

    private PlodnoscMatki plodnoscMatki;

    private String rasa;
}

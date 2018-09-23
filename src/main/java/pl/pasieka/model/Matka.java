package pl.pasieka.model;

import lombok.Getter;
import lombok.Setter;
import pl.pasieka.model.audit.DateUserAudit;
import pl.pasieka.model.enums.PlodnoscMatki;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "matka")
public class Matka extends DateUserAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "matka_generator")
    @SequenceGenerator(name="matka_generator", sequenceName = "matka_seq", allocationSize=50)
    @Column(name = "id", updatable = false, nullable = false)
    private int id;

    @OneToOne
    @JoinColumn(name = "ul_id")
    private Ul ul;

    private Date dataWlozenia;

    private PlodnoscMatki plodnoscMatki;

    private String rasa;
}

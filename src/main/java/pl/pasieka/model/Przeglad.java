package pl.pasieka.model;

import lombok.Getter;
import lombok.Setter;
import pl.pasieka.model.audit.DateUserAudit;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table (name = "przeglad")
public class Przeglad extends DateUserAudit{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "przeglad_generator")
    @SequenceGenerator(name="przeglad_generator", sequenceName = "przeglad_seq", allocationSize=50)
    @Column(name = "id", updatable = false, nullable = false)
    private int id;

    @OneToMany (mappedBy = "przeglad")
    private List<Choroba> choroby;

    @ManyToOne
    @JoinColumn(name = "ul_id")
    private Ul ul;

    @OneToMany(mappedBy = "przeglad")
    private List<Miod> miod;

    @OneToMany(mappedBy = "przeglad")
    private List<Pokarm> pokarm;

    private Date dataWykonania;
}

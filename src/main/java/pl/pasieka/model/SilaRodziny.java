package pl.pasieka.model;

import pl.pasieka.enums.SkalaSzkolna;

import javax.persistence.*;

@Entity
@Table(name = "sila_rodziny")
public class SilaRodziny {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sila_rodziny_generator")
    @SequenceGenerator(name="sila_rodziny_generator", sequenceName = "sila_rodz_seq", allocationSize=50)
    @Column(name = "id", updatable = false, nullable = false)
    private int id;

    @ManyToOne
    @JoinColumn(name = "ul_id")
    private Ul ul;

    private SkalaSzkolna silaRodziny;


}

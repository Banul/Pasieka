package pl.pasieka.model;

import lombok.Getter;
import lombok.Setter;
import pl.pasieka.model.enums.SkalaSzkolna;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "ul")
public class Ul {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ul_generator")
    @SequenceGenerator(name="ul_generator", sequenceName = "ul_seq", allocationSize=50)
    @Column(name = "id", updatable = false, nullable = false)
    private int id;

    @ManyToOne
    @JoinColumn(name = "pasieka_id")
    private Pasieka pasieka;

    @OneToMany(mappedBy = "ul")
    private List<ZadanieUla> zadaniaUla;

    @Enumerated
    @Column(columnDefinition = "smallint")
    private SkalaSzkolna silaRodziny;

    @OneToMany(fetch = FetchType.LAZY,
                cascade = CascadeType.ALL,
                mappedBy = "ul")
    private List<Przeglad> przeglady;

    @OneToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "ul")
    private Matka matka;

    @OneToOne(fetch = FetchType.LAZY,
              cascade = CascadeType.ALL,
              mappedBy = "ul")
    private KondycjaUla kondycjaUla;

    private int liczbaRamek;

    private double szerokoscRamki;

    private double wysokoscRamki;

    private String dodatkoweInformacje;

}

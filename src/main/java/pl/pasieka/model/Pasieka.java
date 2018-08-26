package pl.pasieka.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Table
@Entity(name = "pasieka")
public class Pasieka {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pasieka_generator")
    @SequenceGenerator(name="pasieka_generator", sequenceName = "pasieka_seq", allocationSize=50)
    @Column(name = "id", updatable = false, nullable = false)
    private int id;

    private String nazwa;

    private String ulica;

    private String numerUlicy;

    private String dodatkoweInformacje;

    @OneToMany(mappedBy = "pasieka")
    private List<Ul> ule;

    @OneToMany(mappedBy = "pasieka")
    private List<ZadaniePasieki> zadaniaPasieki;
}

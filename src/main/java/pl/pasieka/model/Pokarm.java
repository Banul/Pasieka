package pl.pasieka.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "pokarm")
public class Pokarm {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pokarm_generator")
    @SequenceGenerator(name="pokarm_generator", sequenceName = "pokarm_seq", allocationSize=50)
    @Column(name = "id", updatable = false, nullable = false)
    private int id;

    @ManyToOne
    @JoinColumn(name = "przeglad_id")
    private Przeglad przeglad;

    private String rodzajPokarmu;

    private String iloscDostarczonegoPokarmu;

}

package pl.pasieka.model;

import lombok.Getter;
import lombok.Setter;
import pl.pasieka.model.audit.DateAudit;
import pl.pasieka.model.audit.DateUserAudit;
import pl.pasieka.model.enums.StanUla;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "kondycja_ula")
public class KondycjaUla extends DateUserAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kondycja_generator")
    @SequenceGenerator(name="kondycja_generator", sequenceName = "kondycja_seq", allocationSize=50)
    @Column(name = "id", updatable = false, nullable = false)
    private int id;

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private Ul ul;

    @Enumerated(EnumType.STRING)
    @Column(name = "stan_ula")
    private StanUla stanUla;

    private String dodatkoweInfo;

}

package cl.siatec.dev.erp.masterdataservice.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "tax")
public class Tax {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "active", nullable = false)
    private Boolean active = false;

    @Column(name = "name", nullable = false, unique = true, length = 75)
    private String name;

    @Column(name = "abrev", nullable = false, unique = true, length = 10)
    private String abrev;

    @Column(name = "description")
    private String description;

    @Column(name = "porcent", nullable = false)
    private Double porcent;

    @Column(name = "factor", nullable = false)
    private Double factor;

    @CreationTimestamp
    @Column(name = "register_at")
    private Timestamp registerAt;

    @UpdateTimestamp
    @Column(name = "update_at")
    private Timestamp updateAt;

}
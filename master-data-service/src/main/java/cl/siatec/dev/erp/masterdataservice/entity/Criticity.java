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
@Table(name = "criticity")
public class Criticity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "active", nullable = false)
    private Boolean active = false;

    @ToString.Exclude
    @ManyToOne(optional = false)
    @JoinColumn(name = "criticity_type_id", nullable = false)
    private CriticityType criticityType;


    @Column(name = "name", nullable = false, unique = true, length = 50)
    private String name;

    @Column(name = "description")
    private String description;

    @CreationTimestamp
    @Column(name = "register_at")
    private Timestamp registerAt;

    @UpdateTimestamp
    @Column(name = "update_at")
    private Timestamp updateAt;



}
package cl.siatec.dev.erp.masterdataservice.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "status_type")
public class StatusType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "active", nullable = false)
    private Boolean active = false;

    @Column(name = "name", nullable = false, unique = true, length = 75)
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
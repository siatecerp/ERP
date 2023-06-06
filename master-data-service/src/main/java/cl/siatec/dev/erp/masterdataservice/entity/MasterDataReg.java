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
@Table(name = "master_data_reg")
public class MasterDataReg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "user_ejec_id", nullable = false)
    private Long userEjecId;

    @Column(name = "action", nullable = false, length = 50)
    private String action;

    @CreationTimestamp
    @Column(name = "fec_reg")
    private Timestamp fecReg;

    @Column(name = "description", nullable = false, length = 100)
    private String description;

    @Column(name = "table", nullable = false, length = 100)
    private String table;

}
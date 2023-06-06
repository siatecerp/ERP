package cl.siatec.dev.erp.masterdataservice.repository;

import cl.siatec.dev.erp.masterdataservice.entity.MasterDataReg;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Timestamp;
import java.util.List;

public interface MasterDataRegRepository extends JpaRepository<MasterDataReg, Long> {
    List<MasterDataReg> findByUserEjecId(Long userEjecId);

    List<MasterDataReg> findByActionIgnoreCase(String action);

    List<MasterDataReg> findByTable(String table);

    List<MasterDataReg> findByFecRegBetween(Timestamp fecRegStart, Timestamp fecRegEnd);



}
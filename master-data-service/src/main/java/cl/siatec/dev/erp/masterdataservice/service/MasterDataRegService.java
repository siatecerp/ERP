package cl.siatec.dev.erp.masterdataservice.service;

import cl.siatec.dev.erp.masterdataservice.entity.MasterDataReg;

import java.sql.Timestamp;
import java.util.List;

public interface MasterDataRegService {

    public MasterDataReg findById(Long id);
    public List<MasterDataReg> findAll();

    public List<MasterDataReg> findByUserEjecId(Long userEjecId);
    public List<MasterDataReg> findByActionIgnoreCase(String action);
    public List<MasterDataReg> findByTable(String table);
    public List<MasterDataReg> findByFecRegBetween(Timestamp fecRegStart, Timestamp fecRegEnd);

    public MasterDataReg save(MasterDataReg masterDataReg);
    public MasterDataReg update(MasterDataReg masterDataReg);
    public MasterDataReg delete(MasterDataReg masterDataReg);

}

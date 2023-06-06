package cl.siatec.dev.erp.masterdataservice.service;

import cl.siatec.dev.erp.masterdataservice.entity.MasterDataReg;
import cl.siatec.dev.erp.masterdataservice.repository.MasterDataRegRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class MasterDataRegServiceImpl implements MasterDataRegService{

    @Autowired
    private MasterDataRegRepository MasterDataRegRepository;


    @Override
    public MasterDataReg findById(Long id) {return MasterDataRegRepository.findById(id).orElse(null);}

    @Override
    public List<MasterDataReg> findAll() {return MasterDataRegRepository.findAll();}

    @Override
    public List<MasterDataReg> findByUserEjecId(Long userEjecId) {return MasterDataRegRepository.findByUserEjecId(userEjecId);}

    @Override
    public List<MasterDataReg> findByActionIgnoreCase(String action) {return MasterDataRegRepository.findByActionIgnoreCase(action);}

    @Override
    public List<MasterDataReg> findByTable(String table) {return MasterDataRegRepository.findByTable(table);}

    @Override
    public List<MasterDataReg> findByFecRegBetween(Timestamp fecRegStart, Timestamp fecRegEnd) {return MasterDataRegRepository.findByFecRegBetween(fecRegStart, fecRegEnd);}

    @Override
    public MasterDataReg save(MasterDataReg masterDataReg) {return MasterDataRegRepository.save(masterDataReg);}

    @Override
    public MasterDataReg update(MasterDataReg masterDataReg) {
        if (masterDataReg.getId() == null) {
            return null;
        }
        MasterDataReg masterDataRegUpdate = findById(masterDataReg.getId());
        masterDataRegUpdate.setUserEjecId(masterDataReg.getUserEjecId());
        masterDataRegUpdate.setAction(masterDataReg.getAction());
        masterDataRegUpdate.setFecReg(masterDataReg.getFecReg());
        masterDataRegUpdate.setDescription(masterDataReg.getDescription());
        masterDataRegUpdate.setTable(masterDataReg.getTable());
        return MasterDataRegRepository.save(masterDataRegUpdate);

    }

    @Override
    public MasterDataReg delete(MasterDataReg masterDataReg) {

        if (masterDataReg.getId() == null) {
            return null;
        }
        MasterDataReg masterDataRegDelete = findById(masterDataReg.getId());
        if (masterDataRegDelete == null) {
            return null;
        }
        MasterDataRegRepository.delete(masterDataRegDelete);
        return masterDataRegDelete;

    }
}

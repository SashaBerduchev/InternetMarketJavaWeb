package net.berduchev.internetmarket.service;

import net.berduchev.internetmarket.dao.PhonesDao;
import net.berduchev.internetmarket.model.Phones;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PhonesServiceImpl implements PhoneService {
    private PhonesDao phonesDao;

    public  void setPhonesDao(PhonesDao phonesDao){this.phonesDao = phonesDao;}

    @Override
    @Transactional
    public void addPhone(Phones phones) {
        this.phonesDao.addPhone(phones);
    }

    @Override
    public void updatePhone(Phones phones) {
        this.phonesDao.updatePhone(phones);
    }

    @Override
    public void removePhone(int id) {
        this.phonesDao.removePhone(id);
    }

    @Override
    public Phones getPhoneById(int id) {
        return this.phonesDao.getPhoneById(id);
    }

    @Override
    public List<Phones> listPhonesList() {
        return this.phonesDao.listPhonesList();
    }
}

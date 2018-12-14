package service;

import dao.PhonesDao;
import model.Phones;

import javax.transaction.Transactional;
import java.util.List;

public class PhonesServiceImpl implements PhoneServise {
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

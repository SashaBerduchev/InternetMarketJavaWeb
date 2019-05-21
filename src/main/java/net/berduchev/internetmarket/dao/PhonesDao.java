package net.berduchev.internetmarket.dao;

import net.berduchev.internetmarket.model.Phones;

import java.util.List;

public interface PhonesDao {
    public void  addPhone(Phones phones);

    public void updatePhone(Phones phones);

    public void removePhone(int id);

    public Phones getPhoneById(int id);

    public List<Phones> listPhonesList();
}

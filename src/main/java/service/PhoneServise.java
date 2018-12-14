package service;

import model.Phones;

import java.awt.*;
import java.util.List;

public interface PhoneServise {
    public void  addPhone(Phones phones);

    public void updatePhone(Phones phones);

    public void removePhone(int id);

    public Phones getPhoneById(int id);

    public List<Phones> listPhonesList();
}

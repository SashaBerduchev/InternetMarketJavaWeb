package dao;

import model.Phones;

import java.util.List;

public interface GraphicsCardDao {
    public void addGraficsCard(Phones phones);

    public void updateGraficsCard(Phones phones);

    public void removeGraficsCard(int id);

    public Phones getGraficsCardById(int id);

    public List<Phones> listGraficsCardList();
}

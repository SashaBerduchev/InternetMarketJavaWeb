package service;

import model.Phones;

import javax.transaction.Transactional;
import java.util.List;

public class GraphicsCardImpl implements  GraficsCardService{

    @Override
    @Transactional
    public void addGraficsCard(Phones phones) {

    }

    @Override
    public void updateGraficsCard(Phones phones) {

    }

    @Override
    public void removeGraficsCard(int id) {

    }

    @Override
    public Phones getGraficsCardById(int id) {
        return null;
    }

    @Override
    public List<Phones> listGraficsCardList() {
        return null;
    }
}

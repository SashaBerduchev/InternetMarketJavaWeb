package dao;

import model.GrphicsCard;
import model.Phones;

import java.awt.*;
import java.util.List;

public interface GraphicsCardDao {
    public void addGraficsCard(GrphicsCard graphics);

    public void updateGraficsCard(GrphicsCard graphics);

    public void removeGraficsCard(int id);

    public GrphicsCard getGraficsCardById(int id);

    public List<GrphicsCard> listGraficsCardList();
}

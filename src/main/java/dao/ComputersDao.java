package dao;

import model.Computers;

import java.util.List;

public interface ComputersDao {

    public void addComputersCard(Computers computers);

    public void updateComputersCard(Computers computers);

    public void removeComputersCard(int id);

    public Computers getComputersCardById(int id);

    public List<Computers> listComputersCardList();
}

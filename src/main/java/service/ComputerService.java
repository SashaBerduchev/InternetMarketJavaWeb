package service;

import dao.ComputersDao;
import model.Computers;

import java.util.List;

public interface ComputerService {
    public void addComputersCard(Computers computers);

    public void updateComputersCard(Computers computers);

    public void removeComputersCard(int id);

    public ComputersDao getComputersCardById(int id);

    public List<Computers> listComputersCardList();
}

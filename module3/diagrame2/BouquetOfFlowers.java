package ua.goit.module3.diagrame2;

import java.util.List;

/**
 * Created by Alex on 04.06.2016.
 */
public class BouquetOfFlowers {

    private List<Flower> flowers;

    public List<Flower> getFlowers()
    {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers)
    {
        this.flowers = flowers;
    }

    public void addFlower(Flower flower)
    {
        this.flowers.add(flower);
    }

}

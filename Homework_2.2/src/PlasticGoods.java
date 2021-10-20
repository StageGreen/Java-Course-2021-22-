import java.util.Comparator;

public class PlasticGoods implements Comparable<PlasticGoods>
{
    public String name;
    public int price;

    public PlasticGoods(String name, int price)
    {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(PlasticGoods goods) {
        return (this.price > goods.price) ? -1 : 1;
    }

}

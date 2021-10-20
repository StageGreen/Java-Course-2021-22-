import java.util.SortedSet;
import java.util.TreeSet;

public class PlasticGoodsManufacturer {
    public String name;
    public TreeSet<PlasticGoods> goods;

    public PlasticGoodsManufacturer(String name)
    {
        this.name = name;
        goods = new TreeSet<PlasticGoods>();
    }


    public void add(String name, int price)
    {
        goods.add(new PlasticGoods(name, price));
    }

    public int avgPrice()
    {
        int sum = 0;
        for(  PlasticGoods e : goods )
        {
            sum += e.price;
        }
        return sum / goods.size();
    }

    public PlasticGoods avgProduct()
    {
        int avgPrice = avgPrice();
        PlasticGoods ceiling = goods.ceiling(new PlasticGoods("null", avgPrice));
        PlasticGoods floor = goods.floor(new PlasticGoods("null", avgPrice));
        return (avgPrice - ceiling.price < floor.price - avgPrice) ?
                ceiling :
                floor;
    }

    public String lowerThanAvg()
    {
        String text = new String();
        SortedSet<PlasticGoods> set = goods.tailSet(avgProduct());
        for (PlasticGoods e : set)
        {
            text += "\"" + e.name + "\":" + e.price + " ";
        }
        return text;
    }

    public String higherThanAvg()
    {
        String text = new String();
        SortedSet<PlasticGoods> set = goods.headSet(avgProduct());
        for (PlasticGoods e : set)
        {
            text += "\"" + e.name + "\":" + e.price + " ";
        }
        return text;
    }



}

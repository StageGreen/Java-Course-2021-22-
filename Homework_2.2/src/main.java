public class main {
    public static void main(String[] args)
    {
        PlasticGoodsManufacturer company = new PlasticGoodsManufacturer("Coca Cola");
        company.add("Coke 500ml", 100);
        company.add("Coke 1l", 250);
        company.add("Diet Coke 500ml", 90);
        company.add("Diet Coke 1l", 180);
        company.add("Orange Fanta", 160);
        company.add("Lemon Fanta", 160);
        company.add("Schweppes", 170);
        company.add("Pink Schweppes", 340);

        System.out.println("Average price is: " + company.avgPrice() + " cents");
        PlasticGoods avgProduct = company.avgProduct();
        System.out.println("Product closest to the average price is: " + avgProduct.name +
                " at the price of " + avgProduct.price + " cents");
        System.out.println("Cheaper products than avg are: " + company.lowerThanAvg());
        System.out.println("More expensive products than avg are: " + company.higherThanAvg());


    }
}

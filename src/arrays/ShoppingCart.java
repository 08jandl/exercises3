package arrays;

public class ShoppingCart {
    public static void main(String[] args) {
        //Shopping Cart
        //In your new class “ShoppingCart” create two arrays,
        // one that contains the names of some items that you want to put in your shopping cart,
        // the second contains the prices for all of your items.
        //Print the contents of your shopping cart to the console with the corresponding price!

        // create a String array and fill it with the names of things in your cart
        String[] itemsInCart = new String[5];
        itemsInCart[0] = "chair";
        itemsInCart[1] = "chocolate";
        itemsInCart[2] = "pen";
        itemsInCart[3] = "vacuum cleaner";
        itemsInCart[4] = "a pair of socks";

        // for your second array that contains the prices
        // make sure to have the same length as your first array by using .length
        double[] itemPrices = new double[itemsInCart.length];
        itemPrices[0] = 58.9;
        itemPrices[1] = 3.8;
        itemPrices[2] = 1.22;
        itemPrices[3] = 135.7;
        itemPrices[4] = 18.4;

        // As long as you filled your arrays in the correct order, you can sinply loop over one array to get the name
        // and access the second array at the same index for the corresponding prices
        for (int i = 0; i < itemsInCart.length; i++){
            System.out.println(itemsInCart[i] + " costs " + itemPrices[i]);
        }


    }
}

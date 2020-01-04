package day27;

public class MallShopping {

    public static void main(String[] args) {



    String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
    double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
    int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};

    //TASK 1. Check if all 3 arrays are exact same length
    //Print "All arrays are equal length"


        if(items.length==prices.length&&items.length==itemIDs.length){
            System.out.println("All arrays are equal length");
        }else{
            System.out.println("Error");
        }


    //TASK 2. Print how many items purchased
    System.out.println("Items count: " + items.length);

    //TASK 3. Print a receipt report.
        /*
            12345 - Shoes - $99.99
            ...
            458.8 * 0.06 + 458.8
            Total price: $458.8 (include tax)
         */
    double totalPrice = 0.0;

        for (int i = 0; i < 6 ; i++) {
            System.out.println(itemIDs[i]+" - "+items[i]+" - "+prices[i] );
            totalPrice=totalPrice+prices[i];

        }
        System.out.println("Total price: "+totalPrice+"(include tax)");

    //TASK 4. Find/Look for "Airpods" in items and print along with price and itemID

        for (int x = 0; x <items.length ; x++) {
            if (items[x].equals("Airpods")){
                System.out.println(itemIDs[x]+" - "+items[x]+" - "+prices[x] );
            }

        }


    //TASK 5. Find the most expensive item and print all details
    //{99.99, 150.0, 9.99, 250.0 , 439.50, 39.99}

    double maxPrice = prices[0];
    int maxPriceIndex = 0;

    // YOUR CODE GOES HERE
        for (int k = 0; k <prices.length ; k++) {
            if(maxPrice<prices[k]) {
                maxPrice = prices[k];
                maxPriceIndex = k;
            }
        }



    // BELOW IS ALREADY WRITTEN FOR YOU
        System.out.println("Most expensive item:");
        System.out.println(itemIDs[maxPriceIndex] + " - " + items[maxPriceIndex] + " - "+prices[maxPriceIndex]);
}
}
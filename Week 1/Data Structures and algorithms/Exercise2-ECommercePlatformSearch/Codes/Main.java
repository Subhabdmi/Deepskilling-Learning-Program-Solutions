import java.util.Arrays;
import java.util.Comparator;

public class Main {
    //implementing search functions using ProductID as key

    //Linear search
    public static Product LinearSearch(Product[] products,int key){
        for (Product p : products){
            if(p.productID==key){
                return p;
            }
        }
        return null;
    }

    //binary search
    public static Product BinarySearch(Product[] products,int key){
        int low=0,high=products.length-1;
        int mid;
        while(low<=high){
            mid=(low+high)/2;
            if(products[mid].productID==key){
                return products[mid];
            }
            else if (key<products[mid].productID) {
                high=mid-1;                
            }
            else{
                low=mid+1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products={new Product(100,"Pen", "Stationary"),
                            new Product(306, "Crayons", "Stationary"),
                            new Product(105,"Lipstick","Cosmetics"),
                            new Product(107,"Nailpaint","Cosmetics"),
                            new Product(200,"Shaving cream","Cosmetics")};


        //calling linear search
        Product p1=LinearSearch(products, 107);
        System.out.println("Name:"+p1.productName+"\nCategory:"+p1.category);

        Arrays.sort(products,Comparator.comparingInt(p -> p.productID));
        //calling binary search

        Product p2=BinarySearch(products, 306);
        System.out.println("Name:"+p2.productName+"\nCategory:"+p2.category);
    }
}

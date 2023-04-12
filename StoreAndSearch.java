
import java.util.ArrayList;
import java.util.Scanner;

class ProductInfo {

    public String namepd;
    public int min_val = Integer.MAX_VALUE;
    public int max_val = Integer.MIN_VALUE;

    ProductInfo(String name, int[] product) {
        this.namepd = name;
        for (int i = 0; i < product.length; i++) {
            if (product[i] >= max_val) {
                max_val = product[i];
            }
            if (product[i] <= min_val) {
                min_val = product[i];
            }
        }
    }

    void printinfo() {
        System.out.println(namepd + " " + min_val + " " + max_val);
    }
}

class Store {

    private ArrayList<ProductInfo> products = new ArrayList<>();

    void enterProductInfo(Scanner sc) {
            String name = sc.next();
            int k = sc.nextInt();
            int[] price = new int[k];
            for (int j = 0; j < k; j++) {
                price[j] = sc.nextInt();
            }
            ProductInfo pdif = new ProductInfo(name , price) ;
            products.add(pdif);
        
    }
    ArrayList<ProductInfo> search(String pdname){
        ArrayList<ProductInfo> f = new ArrayList<>();
        int count = 0 ;
        for(ProductInfo x : products){
            if(x.namepd.indexOf(pdname) != -1){
                f.add(x) ;
                count ++ ;               
            }
        }
        System.out.println(count);
        return f ;
    }

    void printAllProductInfo() {
        for(int i = 0 ; i < products.size(); i ++){
            products.get(i).printinfo(); 
        }
    }
}

public class StoreAndSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Store st = new Store();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            st.enterProductInfo(sc);
        }
        String pdname = sc.next() ;
        ArrayList<ProductInfo> pro = st.search(pdname) ;
        if(pro.size() == 0){
            System.out.println("product not found");
        }
        else{
            for(ProductInfo x : pro ){
                x.printinfo();
            }
        }
            
        
        
    }

}

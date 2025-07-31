package Lib;
import java.util.ArrayList;

public class ProductCatalog 
{
    /**
     * คลาสทำหน้าที่เป็นรายการสินค้าที่จะขาย
     */
    private ArrayList<Product> products = new ArrayList<>();
    //RI: Product list is not null, contains no null elemants.
    //AF: AF(products) = A catalog of all avaliable products.

    private void checkRep()
    {
        if(products == null)
        {
            throw new RuntimeException("RI violated");
        }

        //Check for duplicate products
        for(int i = 0; i < products.size(); i++)
        {
            for(int j = i+1; j < products.size(); j++ )
            {
                if(products.get(i).equals(products.get(j)))
                {
                    throw new RuntimeException("RI violated");
                }
            }
        } 
    }
    public ProductCatalog()
    {
        checkRep();
    }

    /**
     * เพิ่มสินค้าใหม่เข้ารายการ
     * @param product สินค้าที่ต้องการเพิ่ม
     */

    public void addProduct(Product product)
    {
        if(product != null && !products.contains(product))
        {
            products.add(product);
        }
        checkRep();
    }

    /**
     * ค้นหาสินค้าจากรหัสสินค้า
     * @param productId รหัสสินค้าที่ต้องการหา
     */

     public Product findById(String productId)
     {
        for(Product p : products)
        {
            if(p.getproductId().equals(productId))
            {
                return p;
            }
        }
        return null;
     }
}

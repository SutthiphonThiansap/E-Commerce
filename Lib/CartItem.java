package Lib;

public class CartItem 
{
    private final Product product;
    private int quantity;

    //Ri
    
    private void checkRep()
    {
        if(product == null)
        {
            throw new RuntimeException("RI violated");
        }
        if(quantity <= 0)
        {
            throw new RuntimeException("RI violated");
        }
    }
    /**
    * สร้างรายการสินค้าในตะกร้า
    */
    public CartItem(Product product, int quantity)
    {
        this.product = product;
        this.quantity = quantity;
        checkRep();
    }

    /**
     * @return อ็อบเจ็กต์ Product
     */
    public Product geProduct()
    {
        return product;
    }
    public int getQuantity()
    {
        return quantity;
    }

    /**
     * เพิ่มจำนวนสินค้าในรายการนี้
     * @param amount จำนวนที่ต้องการเพิ่ม(ค่าเป็นบวก)
     */

     public void increaseQuantity(int amount)
     {
        if(amount > 0)
        {
            this.quantity = amount;
        }
        checkRep(); //เปลี่ยนแปลงสถาน
     }
}

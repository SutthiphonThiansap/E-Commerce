package Lib;

/*
    ADT ที่ไม่เปลี่ยนรูป สำหรับเก็บข้อมูลสินค้า
    คลาสเป็น final เปลี่ยนแปลงไม่ได้
    */

public final class Product 
{
    private final String productId;
    private final String productName;
    private final double price;

    // Rep Invariant(RI)
    // - productId and productName sre noy null or blank
    // - price >= 0
    //
    //Abstraction Funtion(AF)
    // - AF(productId, ProductName, price) = A product with the giอำื
    
    /**
     * ตรวจสอบว่า RI เป็นจริงหรือไม่
     */
    private void checkRep()
    {
        if(productId == null || productId.isBlank())
        {
            throw new RuntimeException("RI violated : Product ID");
        }
        if(productName == null || productName.isBlank())
        {
            throw new RuntimeException("RI violated : Product Name");
        }
        if(price < 0)
        {
            throw new RuntimeException("RI violated : Price");
        }
    }

    /**
     * @param productId รหัสสินค้าห้ามว่าง
     * @param productName ชื่อสินค้าห้ามว่าง
     * @param price ราคาสินค้าห้ามติดลบ
     */

    public Product(String productId,String productName, double price)
    {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        checkRep(); //ตรวจสอบความถูกต้อง
    }
    public String getproductId()
    {
        return productId;
    }
    public String getproductName()
    {
        return productName;
    }
    public double price()
    {
        return price;
    }
    /**
     * เปรียบเทียบ Product สองชิ้นโดยใช้ productId
     * @param obj อ็อบเจ็กที่ต้องการเปรียบเทียบ
     * @return true ถ้ product ทั้งสองชิ้นเหมือนกัน
     */

     @Override
     public boolean equals(Object obj)
    {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Product product = (Product) obj;
        return productId.equals(product.productId);
    }
}


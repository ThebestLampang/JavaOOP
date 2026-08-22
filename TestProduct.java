public class TestProduct {

    public static void main(String[] args) {

        // สร้าง Object
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();


        // กำหนดข้อมูล product1
        product1.setName("น้ำดื่ม");
        product1.setPrice(10);
        product1.setQuantity(20);


        // กำหนดข้อมูล product2
        product2.setName("ขนม");
        product2.setPrice(15);
        product2.setQuantity(10);


        // กำหนดข้อมูล product3
        product3.setName("ปากกา");
        product3.setPrice(12);
        product3.setQuantity(30);


        // นับจำนวน Object
        product1.addCount();
        product2.addCount();
        product3.addCount();


        // แสดงข้อมูล product1
        System.out.println("สินค้า : " + product1.getName());
        System.out.println("ราคา : " + product1.getPrice());
        System.out.println("จำนวน : " + product1.getQuantity());

        System.out.println();


        // แสดงข้อมูล product2
        System.out.println("สินค้า : " + product2.getName());
        System.out.println("ราคา : " + product2.getPrice());
        System.out.println("จำนวน : " + product2.getQuantity());

        System.out.println();


        // แสดงข้อมูล product3
        System.out.println("สินค้า : " + product3.getName());
        System.out.println("ราคา : " + product3.getPrice());
        System.out.println("จำนวน : " + product3.getQuantity());

        System.out.println();


        // แสดงจำนวน Object
        System.out.println("จำนวน Object = " + Product.getCount());

    }

}

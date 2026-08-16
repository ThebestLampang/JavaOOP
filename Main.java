// =====================================================
// โปรแกรม Java OOP เรื่อง Constructor และ this
// =====================================================

// ขั้นตอนที่ 1: สร้าง Class Main
public class Main {

    // ขั้นตอนที่ 2: สร้าง Method main()
    // โปรแกรมจะเริ่มทำงานจาก Method นี้
    public static void main(String[] args) {

        // ขั้นตอนที่ 3: สร้าง Object human1
        // ใช้ข้อมูลของบุคคลคนที่ 1
        Human human1 = new Human("Poom", 17, 60.0);

        // ขั้นตอนที่ 4: สร้าง Object human2
        // ใช้ข้อมูลของบุคคลคนที่ 2
        Human human2 = new Human("Somchai", 18, 65.0);


        // ขั้นตอนที่ 5: แสดงชื่อของ human1
        System.out.println("Human 1 name: " + human1.name);

        // ขั้นตอนที่ 6: แสดงอายุของ human1
        System.out.println("Human 1 age: " + human1.age);

        // ขั้นตอนที่ 7: แสดงน้ำหนักของ human1
        System.out.println("Human 1 weight: " + human1.weight);


        // ขั้นตอนที่ 8: แสดงชื่อของ human2
        System.out.println("Human 2 name: " + human2.name);

        // ขั้นตอนที่ 9: แสดงอายุของ human2
        System.out.println("Human 2 age: " + human2.age);

        // ขั้นตอนที่ 10: แสดงน้ำหนักของ human2
        System.out.println("Human 2 weight: " + human2.weight);


        // ขั้นตอนที่ 11: เรียกใช้ Method eat() ของ human1
        human1.eat();

        // ขั้นตอนที่ 12: เรียกใช้ Method drink() ของ human1
        human1.drink();


        // ขั้นตอนที่ 13: เรียกใช้ Method eat() ของ human2
        human2.eat();

        // ขั้นตอนที่ 14: เรียกใช้ Method drink() ของ human2
        human2.drink();
    }
}


// =====================================================
// ขั้นตอนที่ 15: สร้าง Class Human
// =====================================================

class Human {

    // ขั้นตอนที่ 16: สร้าง Attribute สำหรับเก็บข้อมูล
    String name;
    int age;
    double weight;


    // ขั้นตอนที่ 17: สร้าง Constructor
    // Constructor มีชื่อเหมือนกับ Class คือ Human
    // รับข้อมูล name, age และ weight
    Human(String name, int age, double weight) {

        // ขั้นตอนที่ 18: ใช้ this กำหนดค่าให้ Attribute
        // this.name = Attribute ของ Object
        // name = Parameter ที่รับเข้ามา
        this.name = name;

        // ขั้นตอนที่ 19: กำหนดค่า age
        this.age = age;

        // ขั้นตอนที่ 20: กำหนดค่า weight
        this.weight = weight;
    }


    // ขั้นตอนที่ 21: สร้าง Method eat()
    // ใช้แสดงข้อความว่า Object กำลังกินอาหาร
    void eat() {

        // this.name คือชื่อของ Object ที่กำลังเรียก Method นี้
        System.out.println(this.name + " is eating");
    }


    // ขั้นตอนที่ 22: สร้าง Method drink()
    // ใช้แสดงข้อความว่า Object กำลังดื่ม
    void drink() {

        // แสดงชื่อของ Object พร้อมข้อความ is drinking
        System.out.println(this.name + " is drinking");
    }
}

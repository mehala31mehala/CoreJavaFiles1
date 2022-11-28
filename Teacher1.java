package TeachersDetails;

public class Teacher1 {
    public Teacher1(String name, String location, int age, int std, String deg) {
        this.name = name;
        this.location = location;
        this.age = age;
        this.std = std;
        this.deg = deg;
    }

    public void Display() {
        System.out.println("Name:" + this.name);
        System.out.println("location:" + this.location);
        System.out.println("Age:" + this.age);
        System.out.println("Std:" + this.std);
        System.out.println("Degree:" + this.deg);
    }

    private String name;
    private String location;
    private int age;
    private int std;
    private String deg;

    public static void main(String[] args) {
        Teacher1 Obj = new Teacher1("Anu", "Ond", 20, 6, "B.sc Maths");
        Teacher1 Obj1 = new Teacher1("Banu", "Ond", 25, 8, "B.sc physics");
        Teacher1 Obj2 = new Teacher1("Reika", "TMK", 35, 6, "B.A english");
        Teacher1 Obj3 = new Teacher1("Keerthi", "Ond", 20, 8, "B.sc Maths ");
        Teacher1 Obj4 = new Teacher1("Mehala", "TMK", 20, 9, "B.com");
        Obj.Display();
        Obj1.Display();
        Obj2.Display();
        Obj3.Display();
        Obj4.Display();
    }
}

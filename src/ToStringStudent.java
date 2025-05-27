public class ToStringStudent {
    String name;
    int age;
    String roll;
    String house;

    public ToStringStudent(String name, int age, String roll, String house) {

        this.name = name;
        this.age = age;
        this.roll = roll;
        this.house = house;
    }

    @Override
    public String toString() {
       return "Student Details:{name:"+name+"" +
               ",age:"+age+"," +
               "roll:"+roll+"," +
               "house:"+house+"}";


    }

    public static void main(String[] args) {
        ToStringStudent stu=new ToStringStudent("suraj",45,"0822CS221185","pithampur");
        System.out.println(stu);
    }
}



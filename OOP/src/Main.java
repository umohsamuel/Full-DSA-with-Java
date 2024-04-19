import static com.umoh.understanding.UnderPackages.understandingPackages;

public class Main {
    public static void main(String[] args) {
        Student BigSam = new Student(4.5f, "BigSam", 20);
        System.out.println(BigSam.GPA);
        System.out.println(BigSam.Name);
        System.out.println(BigSam.Age);

//        Student Newbie;
//
//        for (int i = 1; i <= 10000000; i++) {
//            Newbie = new Student(4.9f, "Tester", 21);
//            System.out.println(Newbie.Name);
//        }

        understandingPackages();

    }


    static class Student {
        float GPA;
        String Name;
        int Age;

        Student() {
            this.GPA = 5.0f;
            this.Name = "Fresher";
            this.Age = 18;
        }

        Student(float GPA, String Name, int Age) {
            this.GPA = GPA;
            this.Name = Name;
            this.Age = Age;
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("This runs when the Student Object has be destroyed");
        }
    }
}
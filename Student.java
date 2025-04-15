public class Student {
    String name;
    int age;

      void setDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

      void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

      public static void main(String[] args) {
               Student s = new Student();
                s.setDetails("Divya", 22);
       		Displaying details
        	s.display();
    }
}

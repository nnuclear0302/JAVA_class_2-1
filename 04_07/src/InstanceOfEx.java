class Person {}
class Student extends Person {}
class Researcher extends Person {}
class Professor extends Person {}

public class InstanceOfEx {
    static void print(Person p) {
        if (p instanceof Person)
            System.out.println("Person ");
        if (p instanceof Student)
            System.out.println("Student ");
        if (p instanceof Researcher)
            System.out.println("Researcher ");
        if (p instanceof Professor)
            System.out.println("Professor ");
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.print("new Student() -> "); print(new Student());
        System.out.print("new Researcher() -> "); print(new Researcher());
        System.out.print("new Professor() -> "); print(new Professor());
    }
}

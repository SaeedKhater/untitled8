package tr.edu.maltepe;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setId(1);
        person1.setName("Muhammet");
        person1.setSurname("Şafak");
        person1.setAge(20);

        Student student1 = new Student();
        student1.setId(2);
        student1.setName("Saeed");
        student1.setSurname("Tariq");
        student1.setAge(20);
        student1.setStudentNumber(190704801);

        Professor professor1 = new Professor();
        professor1.setId(3);
        professor1.setName("Ensar");
        professor1.setSurname("Gül");
        professor1.setAge(30);

        System.out.println("Person 1 : " + person1.getName() + " " + person1.getSurname());
        System.out.println("Age : " + person1.getAge());

        System.out.println("Student 1 : " + student1.getName() + " " + student1.getSurname());
        System.out.println("Age : " + student1.getAge());
        System.out.println("Student Number : " + student1.getStudentNumber());

        System.out.println("Professor : " + professor1.getName() + " " + professor1.getSurname());
        System.out.println("Age : " + professor1.getAge());



        professor1.teach();
        student1.learn();
        student1.talks();
        professor1.talks();


    }
}
public class CallSetterMethod {

    public static void main(String[] args) {
        PersonSet person = new PersonSet();
        person.setName("Karishma");
        person.setAge(39);


        StudentClass student = new StudentClass();
        student.setName("Anushri");
        student.setAge(12);
        student.setStudentid(4);

        System.out.println(person.getName()+" is "+ person.getAge()+" years old.");
        System.out.println(student.getName()+" is "+ student.getAge()+" years old "+ "and her id no is "+student.getStudentid());
    }


}

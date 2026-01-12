public class Student {
    int age;
    String name;
    final int phone;
    private Student(int age,String name,int phone){
        this.age = age;
        this.name =name;
        this.phone=phone;
    }
    static Student makeStudent(int age, String name,int phone){
        return new Student(age,name,phone);
    }

    @Override
    public String toString() {
        return (
                "THE STUDENT NAME IS " + this.name +
                        " AND STUDENT AGE IS " + this.age +
                        " AND PHONE NUMBER IS " + this.phone
                );
    }

    static void main(String[] args) {
        Student newStudent1 = Student.makeStudent(22,"Umair",342);
        Student newStudent2 = Student.makeStudent(22,"Umair",234);
        System.out.println(newStudent1);
        System.out.println(newStudent2);
    }

}

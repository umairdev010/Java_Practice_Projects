public class Student {
    int age;
    String name;
    private Student(int age,String name){
        this.age = age;
        this.name =name;
    }
    static Student makeStudent(int age, String name){
        return new Student(age,name);
    }

    @Override
    public String toString() {
        return (
                "THE STUDENT NAME IS " + this.name +
                        " AND STUDENT AGE IS " + this.age
                );
    }

    static void main(String[] args) {
        Student newStudent = Student.makeStudent(22,"Umair");
        System.out.println(newStudent);
    }

}

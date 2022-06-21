public class FirstYear {
    public static void main(String[] args)
        {
             Student[] students=new Student[5];

             int[] marks ={88,99,100,90,70};
             String[] names ={"Riya","Gungun","Ankur","Anita","Om"};

             for (int i=0;i<5;i++){
                 Student student = new Student(names[i], marks[i]);
                 students[i]= student;
             }

             bestStudent(students);
        }
            

    static void bestStudent(Student[] students)
    {
        int max=0;
        String studentWithMaxMarks="";
        for (Student student : students) {
            if (student.marks > max) {
                max = student.marks;
                studentWithMaxMarks = student.name;
            }
        }
        System.out.println("Best student is : "+studentWithMaxMarks);
    }
}

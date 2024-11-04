import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private double[] estimation;

    public Student(String name, String group, int course, double[] estimation) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.estimation = estimation;
    }
    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }


    public void TransferNextCourse(){
        double average = 0;
        if (estimation.length > 0)
        {
            double sum = 0;
            for (double v : estimation) {
                sum += v;
            }
            average = sum / estimation.length;
        }
        if (average>=3){
            System.out.println(name + " переведен на следующий курс, так как его средний балл составляет: "+average);
        }
        else
            System.out.println(name + " не переведен на следующий курс, так как его средний балл составляет: "+average);

    }
    public static void printStudents(List<Student> students, int course) {
        System.out.println("На "+course+" курсе состоят:");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}

import java.util.ArrayList;
import java.util.List;


public class Runner {
    public static void main(String[] args) {
        Student student1 = new Student("Лифшиц Никита", "О-22-МОА-тп-Б",3, new double[]{2, 5, 3.5, 4});
        Student student2 = new Student("Сорочинский Денис", "О-22-МОА-тп-Б",3, new double[]{2, 3, 3.5, 3});
        Student student3 = new Student("Спасский Михаил", "О-22-МОА-тп-Б",3, new double[]{2, 4, 4, 4});

        List<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        student2.TransferNextCourse();
        Student.printStudents(students, 3);

    }
}

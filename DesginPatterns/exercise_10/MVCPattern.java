package exercise_10;

public class MVCPattern {
    public static void main(String[] args) {
        Student student = new Student("Jayasai", "32", "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);
        controller.updateView();
        controller.setStudentName("Bright Sherlin Joel");
        controller.setStudentId("18");
        controller.setStudentGrade("B");
        controller.updateView();
    }
}

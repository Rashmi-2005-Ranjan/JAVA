public class Course {
    public String courseName;
    public int enrolledStudents;
    public static int maxCapacity = 0;
    public void enrolledStudents(String studentName){
        if (enrolledStudents < maxCapacity) {
            enrolledStudents++;
            System.out.println(studentName + " has been enrolled in the course: " + courseName);
        } else {
            System.out.println("Cannot enroll " + studentName + ". Course is full.");
        }
    }
    public void unenrollStudent(String studentName){
        if (enrolledStudents > 0) {
            enrolledStudents--;
            System.out.println(studentName + " has been unenrolled from the course: " + courseName);
        } else {
            System.out.println("No students to unenroll from the course: " + courseName);
        }
    }

    public static void setMaxCapacity(int capacity){
        Course.maxCapacity = capacity;
        System.out.println("Max capacity for courses has been set to: " + maxCapacity);
    }
}

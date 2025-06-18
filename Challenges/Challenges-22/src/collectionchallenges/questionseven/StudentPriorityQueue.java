package collectionchallenges.questionseven;

import java.util.Comparator;
import java.util.PriorityQueue;

public class StudentPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<> ( new Comparator<Student> ( ) {
            @Override
            public int compare(Student s1 , Student s2) {
                return s1.getGrade ( ) - s2.getGrade ( );
            }
        } );

        queue.offer ( new Student ( "Prashant" , 'B' ) );
        queue.offer ( new Student ( "Sanchit" , 'A' ) );
        queue.offer ( new Student ( "Ankit" , 'C' ) );
        queue.offer ( new Student ( "Rohit" , 'B' ) );
        queue.offer ( new Student ( "Sahil" , 'A' ) );
        queue.offer ( new Student ( "Ravi" , 'C' ) );
        queue.offer ( new Student ( "Amit" , 'B' ) );
        System.out.println ( "Students Queue Is: " + queue );
        System.out.println (queue.poll () );
        System.out.println (queue.poll () );
        System.out.println (queue.poll () );
        System.out.println (queue.poll () );
        System.out.println (queue.poll () );
        System.out.println (queue.poll () );
        System.out.println (queue.poll () );
        System.out.println ( "Students Queue Is: " + queue );
    }

    private static class Student {
        private final String name;
        private final char grade;

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

        private Student(String name , char grade) {
            this.name = name;
            this.grade = grade;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder ( "Student{" );
            sb.append ( "name='" ).append ( name ).append ( '\'' );
            sb.append ( ", grade=" ).append ( grade );
            sb.append ( '}' );
            return sb.toString ( );
        }
    }
}

package  custom;
import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Natural order: ascending by marks
    @Override
    public int compareTo(Student s) {
        return Integer.compare(this.marks, s.marks);
    }

    @Override
    public String toString() {
        return name + " - " + marks;
    }
}

class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);  // alphabetical
    }
}



public class CompareableC {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Ravi", 85));
        list.add(new Student("Akshit", 75));
        list.add(new Student("Neha", 90));

        // Sorting using Comparable (marks)
        Collections.sort(list);
        System.out.println("Sorted by marks (Comparable):");
        for (Student s : list) {
            System.out.println(s);
        }

        // Sorting using Comparator (name)
        Collections.sort(list, new NameComparator());
        System.out.println("\nSorted by name (Comparator):");
        for (Student s : list) {
            System.out.println(s);
        }
    }
}

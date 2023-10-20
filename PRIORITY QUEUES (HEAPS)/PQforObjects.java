import java.util.PriorityQueue;

public class PQforObjects {
    static class Student implements Comparable<Student> { // Overriding
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;

        }
    }

    public static void main(String args[]) {
        PriorityQueue<Student> pq = new PriorityQueue<>(); // to reverse-(Comparator.reverseOrder())

        pq.add(new Student("A", 4)); // 0(logn)
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 12));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + "->" + pq.peek().rank);
            pq.remove(); // 0(logn)
        }

    }
}

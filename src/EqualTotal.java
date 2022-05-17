import java.util.Comparator;

public class EqualTotal implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.total == o2.total){
            return o1.getName().compareTo(o2.getName());
        } else {
            return Integer.compare(o1.total, o2.total);
        }
    }
}

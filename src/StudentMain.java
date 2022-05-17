import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//    학번(String 타입으로), 이름, 국어점수, 영어점수, 수학점수, 총점, 등수를 멤버로 갖는
//    Student클래스를 만든다.
//    생성자는 학번, 이름, 국어, 영어, 수학 점수만 매개변수로 받아서 처리한다.
//
//    이 Student객체들은 List에 저장하여 관리한다.
//    List에 저장된 데이터들을 학번의 오름차순으로 정렬하여 출력하는 부분과 총점의 역순으로 정렬하는 부분을 프로그램 하시오.
//            (총점이 같으면 학번의 내림차순으로 정렬되도록 한다.)
//            (학번 정렬기준은 Student클래스 자체에서 제공하도록 하고,
//    총점 정렬기준은 외부클래스에서 제공하도록 한다.)
public class StudentMain {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("1584012", "홍길동", 76, 72, 83));
        list.add(new Student("1484011", "고길동", 89, 88, 49));
        list.add(new Student("1684015", "손흥민", 76, 72, 83));
        list.add(new Student("1884013", "박지성", 56, 63, 93));
        list.add(new Student("2084009", "차범근", 66, 77, 88));
        System.out.println("학번정렬전");
        for(Student student : list){
            System.out.println(student.toString());
        }
        System.out.println("-----------------");
        Collections.sort(list);

        System.out.println("학번정렬후");
        setRank(list);
        for(Student student : list){
            System.out.println(student.toString());
        }
        System.out.println("----------------");
        System.out.println("총점 같으면 이름정렬");
        Collections.sort(list, new EqualTotal());
        for (Student student : list){
            System.out.println(student);
        }
    }

    public static void setRank(List<Student> list){
        for (Student student1 : list){
            int rank = student1.rank;
            for(Student student2 : list){
                if(student1.getTotal() < student2.total){
                    rank++;
                }
            }
            student1.setRank(rank);
        }
    }
}

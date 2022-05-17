import java.util.Comparator;
import java.util.List;

public class Student implements Comparable<Student> {

public String num;
public String name;
public int kor;
public int eng;
public int math;
public int total;
public int rank;

    public Student(String num, String name, int kor, int eng, int math) {
        this.num = num;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.total = kor + eng + math;
        this.rank = 1;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public int compareTo(Student o) {
        return this.getNum().compareTo(o.getNum());
    }

    @Override
    public String toString() {
        return String.format("학번: %s, 이름: %s, 국어: %s, 영어: %s, 수학: %s, 총점: %s, 등수: %s", num, name, kor, eng, math,
                getTotal(), getRank());
    }

}


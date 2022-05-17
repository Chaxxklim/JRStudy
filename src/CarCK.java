import java.util.Scanner;

public class CarCK {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBoot() {
        return boot;
    }

    public void setBoot(String boot) {
        this.boot = boot;
    }

    public String getTrunk() {
        return trunk;
    }

    public void setTrunk(String trunk) {
        this.trunk = trunk;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    String name;
    String boot;
    String trunk;
    int size;
    String type;
    int time;

    public CarCK(String name, String boot, String trunk, int size, String type, int time) {
        this.name = name;
        this.boot = boot;
        this.trunk = trunk;
        this.size = size;
        this.type = type;
        this.time = time;
    }

    public CarCK(){

    }

    public static void InputSetting(){
        String input = "";
        Scanner sc = new Scanner(System.in);
        CarCK carCK = new CarCK();

        System.out.println("차종을 입력하세요.");
        carCK.setName(sc.nextLine());

        System.out.println("배기량은 얼마인가요?");
        carCK.setSize(sc.nextInt());

        System.out.println("연식은?");
        carCK.setTime(sc.nextInt());

        System.out.println("시동을 걸까요?");
        carCK.setBoot(sc.nextLine());

        System.out.println("트렁크를 열까요?");
        carCK.setTrunk(sc.nextLine());

        System.out.println("세팅 끝입니다.");

        System.out.println("차종 : " + carCK.getName());
        System.out.println("배기량 : " + carCK.getSize() + "cc");
        System.out.println("연식 : " + carCK.getTime() + "년식");
        System.out.println("시동 : " + carCK.getBoot());
        System.out.println("트렁크 : " + carCK.getTrunk());
    }

    public static void main(String[] args) {
        InputSetting();
    }

}

public class Car {
    public static void main(String[] args) {

        String push = " 누를경우";
        String near = " 가까이 다가갈 경우";
        String start = "시동을 걸면";

        String door = " 문을";
        String window = " 창문을";
        String trunk = " 트렁크가";

        String num1 = " 연다";
        String num2 = " 닫는다";
        String num3 = " 열린다";

        String car1 = "SM5";
        String car2 = "K5";
        String car3 = "SM7";

        System.out.println("\n\n-1번-\n");
        Car("SM5", "2000cc", "중형", "12년식\n\n");
        System.out.println("-2번-\n");
        Car("K5", "2000cc", "중형", "15년식\n\n");
        System.out.println("-3번-\n");
        Car("SM7", "3000cc", "중형", "18년식\n\n");

        System.out.println(car1 + " 차키의 버튼을" + push + door + num1);
        System.out.println(car2 + "의 뒤로" + near + trunk + num3);
        System.out.println(car3 + "의 " + start + window + num2);
    }

    public static void Car(String kind, String size, String type, String time) {
        System.out.println("차종 : " + kind + "\n배기량 : " + size + "\n종류 : " + type + "\n연식 : " + time);
    }


}

//사용자가 입력한 값과, 컴퓨터가 랜덤으로 출력하는 값을 비교해 가위바위보의 승패를 출력하세요.
//ex)
//    가위, 바위, 보 중 하나를 입력하세요.
//    사용자 : 보
//    컴퓨터 : 보
//    결과 : 비겼습니다.
//
//    가위, 바위, 보 중 하나를 입력하세요.
//    사용자 : 보
//    컴퓨터 : 가위
//    결과 : 사용자가 졌습니다.
//
//    가위, 바위, 보 중 하나를 입력하세요.
//    사용자 : 주먹
//    컴퓨터 : 가위
//    결과 : 사용자가 이겼습니다.
//

//
//    Scanner scanner = new Scanner(System.in);
//    scanner.nextLine();
//    을 통해 사용자의 값을 입력받을 수 있습니다.

//    com()은 가위, 바위, 보 중 하나를 랜덤으로 return 하는 메소드입니다.
// String 변수명 = com();
// 을 통해 컴퓨터의 값을 변수에 저장할 수 있습니다.


public class Homework {
    public static void main(String[] args) {

    }

    public static String com(){
        String com;
        int comNum = (int) (Math.random() * 3 + 1) ;
        if (comNum == 1) com = "가위";
        else if (comNum == 2) com = "바위";
        else com = "보";
        return com;
    }
}

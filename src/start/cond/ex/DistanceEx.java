package start.cond.ex;

public class DistanceEx {
    public static void main(String[] args) {
        int distance = 4;
        String vehicle = ""; // 하나의 변수에는 값이 하나만 들어간다.
        if (distance <= 1) {
            vehicle = "도보";
        }if (distance >1 && distance <= 10) {
            vehicle = "자전거";
        }if (distance > 10 && distance <= 100) {
            vehicle = "자동차";
        }if(distance > 100) {
            vehicle = "비행기";
        }
        System.out.println(vehicle + "를 이용하세요.");
//
//        int price;
//        switch (vehicle) {
//            case "도보":
//                price = 0;
//                break;
//            case "자전거" :
//                price = 2000;
//                break;
//            case "자동차" :
//                price = 30000;
//                break;
//            default :
//                price = 100000;
//        }
//        System.out.println("이용금액은 " + price + "입니다.");
    }
}


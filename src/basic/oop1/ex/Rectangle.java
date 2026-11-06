package basic.oop1.ex;

public class Rectangle {
    //속성 : 너비(width), 높이(height),넓이(area),둘레 길이
    //기능 : 넓이구하기, 둘레구하기, 정사각형 여부구하기

    //속성
    int width;
    int height;
    int area;
    int perimeter;
    boolean square;

    //기능
    //파라미터에 아무것도 안 넣는 이유 : 자신의 멤버변수를 사용하기 때문에
    int calculateArea(){
        return width * height;
    }
    int calculatePerimeter(){
        return (width + height)*2;
    }
    boolean isSquare(){
        return width == height;
    }

}

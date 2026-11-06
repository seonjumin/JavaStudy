package basic.class1;

public class StudentMain {

    public static void main(String[] args){
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 69;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 40;


        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

//        System.out.println(student1.name);
//        == System.out.println(students[0].name);


        //출력부분
        for(int i = 0; i < students.length; i++){
            System.out.println("이름 : "+ students[i].name+", 나이 : "+students[i].age + ", 성적 : "+ students[i].grade);
        }
        for(int i = 0; i < students.length; i++){
            Student s = students[i];
            System.out.println("이름 : "+ s.name+", 나이 : "+s.age + ", 성적 : "+ s.grade);
        }
        for(Student s: students){ //단축키 : iter
            System.out.println("이름 : "+ s.name+", 나이 : "+s.age + ", 성적 : "+ s.grade);
        }


//        System.out.println("이름 : "+ student1.name+", 나이 : "+student1.age + ", 성적 : "+ student1.grade);
//        System.out.println("이름 : "+ student2.name+", 나이 : "+student2.age + ", 성적 : "+ student2.grade);


        // 객체 : 클래스에서 정의한 속성과 기능을 가진 실체
        // 인스턴스 : 객체가 어떤 클래스에 속해 있는지 표현할때 사용 ex)student1은 Student 클래스의 인스턴스이다.
    }
}

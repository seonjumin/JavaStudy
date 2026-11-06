package start.cond.ex;

public class ScoreEx {
    public static void main(String[] args){
        int score = 55;
        String grade;
        if(score >= 90){
            grade = "A";
        }else if(80 <= score && score < 90){
                            //어짜피 90이상은 A이므로 뒤의 범위는 불필요 (score >= 80)
            grade = "B";
        }else if(70 <= score && score < 80){
            grade = "C";
        }else if(60 <= score && score < 70){
            grade = "D";
        }else{
            grade = "F";
        }
        System.out.println("학점은 "+grade+"입니다.");

        String name;
        switch(grade){
            case "A" :
                name = "수";
                //System.out.println("수");
                break;
            case "B" :
                name = "우";
                //System.out.println("우");
                break;
            case "C" :
                name = "미";
                //System.out.println("미");
                break;
            case "D" :
                name = "양";
                //System.out.println("양");
                break;
            default  :
                name = "가";
                //System.out.println("가");
        }
        System.out.println("성적은 " + name + "입니다.");
    }
}

public class Main {
    public static void main(String[] args) {
        //정수
        int a = 0;
        int a_1;
        int intTempValue;
        //실수
        double b = 0.0;
        //논리형
        boolean c = true;
        boolean c_1;
        //문자열
        String dd;
        String ddd = "hahaha";

        int temp_a = 0;
        int temp_b = 0;
        int temp_c = 0;
        temp_b = 4;
        temp_a = temp_b + 2;
        temp_a = temp_b - 2;
        System.out.println("temp_a : " + temp_a);
        temp_a++;
        temp_a--;
        ++temp_a;
        --temp_a;

        boolean boolean_a = false;
        boolean_a = (temp_a == temp_b);
        boolean_a = (temp_a != temp_b);
        boolean_a = (temp_a > temp_b);
        System.out.println("boolean_a : " + boolean_a);

        int score = 95;
        String grade = "";

        if(score >= 90){
            grade = "A";
        } else if(score >= 80){
            grade = "B";
        } else {
            grade = "F";
        }

        switch(grade){
            case "A" :
                {
                    System.out.println("A?!");
                }
                break;
            default :
                //여기에 실행하고자 하는 내용 적으시면 됩니다.
                break;
        }

        //고전중의 고전 구구단 출력해보기
        for(int i=0;i<9;i++){
            System.out.println((i+1) + "단 시작..");
            for(int j=0;j<9;j++){
                System.out.println((i+1) + "X" + (j+1) + "=" + ((i+1)*(j+1)));
            }
        }

        int while_i = 0;
        int while_j = 0;
        while(while_i < 9){
            System.out.println(while_i++ + "단 시작..");
            while(while_j < 9){
                while_j = while_j + 1;
                System.out.println(while_i + "X" + while_j + "=" + (while_i*while_j));
            }
            while_j = 0;
        }






    }
}
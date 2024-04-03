package week5;
import java.util.*;

public class Study1 {
    public static void main(String[] args) {
        Study1 aStudy = new Study1();
        //aStudy.p1();

        String[] params = {"a","b","c"};
        //aStudy.printArray(params);
        //aStudy.listTest();
        aStudy.mapTest();

        char a = 'A';
        String aaa = "abc";
        for(int i=0;i<aaa.length();i++){
            System.out.println("aaa : "+ aaa.substring(i, i+1));

        }
        //2024-03-11
        //20240311

    }

    void mapTest(){
        Map<String, Object> amap = new HashMap<>();
        //자료 넣기
        amap.put("key1", "aaaa");
        amap.put("key2", 1234);
        //자료 제거
        amap.remove("key2");
        //자료 접근
        System.out.println("key1 : "+ amap.get("key1"));
        System.out.println("key2 : "+ amap.get("key2"));
    }
    void listTest(){
        List<String> alist = new ArrayList<>();
        //리스트에 정보 추가
        alist.add("a");
        alist.add("bb");
        alist.add("ccc");
        System.out.println("alist : "+ alist.size());
        //리스트에 정보 제거
        alist.remove(0);
        for(String aa : alist){
            System.out.println("aa : "+ aa);
        }
        //리스트에 있는 특정 정보 가져와보기
        System.out.println("aa : "+ alist.get(0));
    }
    void printArray(String[] params){
        System.out.println("total count : "+ params.length);
        for(String param : params){
            System.out.println("param : "+ param);
        }
    }
    void p1(){
        int[] a;
        a = new int[6]; // 0~5

        //Integer[] b = new Integer[6];
        a[0] = 1;
        a[1] = 1;
        a[0] = 1;
        a[5] = 1;

        int[] numbers2 = new int[5];
        int[] numbers = {1,2,3,4,5};

        int[] numbers100 = new int[100];
        double[] doubles = {1.2, 3.1, 6.7};

        //각 숫자를 출력하는 for문을 작성해보세요!
        for(int i=0;i<numbers.length;i++){
            int number = numbers[i];
            System.out.println("i : "+ i +"번째 : //"+ number);
        }
        //for-each
        int temp_i=0;
        for(int number : numbers){
            System.out.println("i : "+ temp_i +"번째 : //"+ number);
            temp_i++;
        }

        String[] names = {"a","b","c"};
        for(int i=0;i<names.length;i++){
            String name = names[i];
            System.out.println("name : "+ name);
        }
        for(String name : names){
            System.out.println("name : "+ name);
        }

        //리스트 => ArrayList
        //배열로 만들어보기!?
        /*
        Class명은 ListArray
        add
        get
        remove
        removeAll
        * */

        //맵 => HashMap
        //배열로 만들어보기!?
        /*
        Class명은 MapHash
        put
        get
        remove
        removeAll
        * */

        int[][] testArray = {
                {10, 20, 30}, {40, 50, 60}, {70, 80, 90}
        };

        for(int[] each : testArray){
            for(int each_a : each){
                System.out.println("each_a : "+ each_a);
            }
        }





    }
}
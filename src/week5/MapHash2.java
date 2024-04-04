package week5;

public class MapHash2 {
    //필드는 저는 1개 쓸께요!
    //이중 배열 1개!!
    Object[][] keyvalue_array = new Object[0][0];

    //초기화! 클래스에서는 생성자!
    public MapHash2() {
        keyvalue_array = new Object[0][2];
    }

    public int findOrderByKey(String s){
        int target_i = -1;
        for(int i=0;i<keyvalue_array.length;i++){
            if(s.equals(keyvalue_array[i][0])){
                target_i = i;
            }
        }
        return target_i;
    }
    //맵에 추가하기
    public void put(String s, Object o) {
        int target_i = findOrderByKey(s);
        if(target_i == -1){
            Object[][] new_array = new Object[keyvalue_array.length + 1][2];
            for(int i=0;i<keyvalue_array.length;i++){
                for(int t=0;t<keyvalue_array[i].length;t++){
                    new_array[i][t] = keyvalue_array[i][t];
                }
            }
            new_array[keyvalue_array.length][0] = s;
            new_array[keyvalue_array.length][1] = o;
            keyvalue_array = new_array;
        } else {
            keyvalue_array[target_i][1] = o;
        }
    }

    public Object get(String s) {
        Object returnValue = null;
        int target_i = findOrderByKey(s);
        if(target_i == -1){
        } else {
            returnValue = keyvalue_array[target_i][1];
        }
        return returnValue;
    }

    public void remove(String s) {
        int target_i = findOrderByKey(s);
        if(target_i == -1){
            //키에 없는것을 지우려고 할때.. 그냥 패쓰!!
        } else {
            Object[][] new_array = new Object[keyvalue_array.length - 1][2];
            for(int i=0;i<target_i;i++){
                new_array[i][0] = keyvalue_array[i][0];
                new_array[i][1] = keyvalue_array[i][1];
            }
            for(int i=target_i+1;i<keyvalue_array.length;i++){
                new_array[i-1][0] = keyvalue_array[i][0];
                new_array[i-1][1] = keyvalue_array[i][1];
            }
            keyvalue_array = new_array;
        }
    }

    public void printMapHash() {
        System.out.println("length : " + keyvalue_array.length);
        for(int i=0;i<keyvalue_array.length;i++){
            System.out.println(keyvalue_array[i][0] + " : " + keyvalue_array[i][1]);
        }
    }

}
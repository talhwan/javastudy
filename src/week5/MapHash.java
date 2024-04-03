package week5;

public class MapHash {
    //필드는 저는 두개 쓸께요!
    //배열 두개!!
    String[] key_array = new String[0];
    Object[] value_array = new Object[0];

    //초기화! 클래스에서는 생성자!
    public MapHash() {
        key_array = new String[0];
        value_array = new Object[0];
    }
    
    //맵에 추가하기
    public void put(String s, Object o) {
        int target_i = -1;
        for(int i=0;i<key_array.length;i++){
            if(s.equals(key_array[i])){
                target_i = i;
            }
        }
        if(target_i == -1){
            String[] new_array = new String[key_array.length + 1];
            Object[] new_array2 = new Object[key_array.length + 1];
            for(int i=0;i<key_array.length;i++){
                new_array[i] = key_array[i];
                new_array2[i] = value_array[i];
            }
            new_array[key_array.length] = s;
            new_array2[key_array.length] = o;
            key_array = new_array;
            value_array = new_array2;
        } else {
            //key_array[target_i] = s;
            value_array[target_i] = o;
        }
    }

    public Object get(String s) {
        Object returnValue = null;
        int target_i = -1;
        for(int i=0;i<key_array.length;i++){
            if(s.equals(key_array[i])){
                target_i = i;
            }
        }
        if(target_i == -1){
        } else {
            returnValue = value_array[target_i];
        }
        return returnValue;
    }

    public void remove(String s) {
        int target_i = -1;
        for(int i=0;i<key_array.length;i++){
            if(s.equals(key_array[i])){
                target_i = i;
            }
        }
        if(target_i == -1){
            //키에 없는것을 지우려고 할때.. 그냥 패쓰!!
        } else {
            String[] new_array = new String[key_array.length - 1];
            Object[] new_array2 = new Object[key_array.length - 1];
            for(int i=0;i<target_i;i++){
                new_array[i] = key_array[i];
                new_array2[i] = value_array[i];
            }
            for(int i=target_i+1;i<key_array.length;i++){
                new_array[i-1] = key_array[i];
                new_array2[i-1] = value_array[i];
            }
            key_array = new_array;
            value_array = new_array2;
        }
    }

    public void printMapHash() {
        System.out.println("length : " + key_array.length);
        for(int i=0;i<key_array.length;i++){
            System.out.println(key_array[i] + " : " + value_array[i]);
        }
    }

}
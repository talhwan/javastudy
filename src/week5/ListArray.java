package week5;

public class ListArray {
    //필드는 저는 하나만 쓸께요!
    //배열 하나!!
    //Object[] a_array = new Object[0];
    Object[] a_array = {};

    //초기화! 클래스에서는 생성자!
    public ListArray() {
        a_array = new Object[0];
    }
    
    //리스트에 추가하기
    public void add(Object o) {
        Object[] new_array = new Object[a_array.length + 1];
        for(int i=0;i<a_array.length;i++){
            new_array[i] = a_array[i];
        }
        new_array[a_array.length] = o;
        a_array = new_array;
    }

    //리스트에 있는 번호인지 확인하는 메서드
    public boolean ableToAccess(int each){
        boolean returnValue = false;
        if(each < a_array.length && each >= 0){
            returnValue = true;
        }
        return returnValue;
    }
    //리스트에 있는 정보 하나 가져오기
    public Object get(int each) {
        Object returnValue = null;
        /*
        if(each < a_array.length && each >= 0){
            returnValue = a_array[each];
        }
         */
        if(ableToAccess(each)){
            returnValue = a_array[each];
        }
        return returnValue;
    }

    //리스트에 있는 정보 하나 지우기
    public void remove(int each) {
        if(ableToAccess(each)){
            Object[] new_array = new Object[a_array.length - 1];
            for(int i=0;i<each;i++){
                new_array[i] = a_array[i];
            }
            for(int i=each+1;i<a_array.length;i++){
                new_array[i-1] = a_array[i];
            }
            a_array = new_array;
        }
    }
    public void remove() {
        remove(a_array.length - 1);
    }

    public void printListArray() {
        System.out.println("length : " + a_array.length);
        for(int i=0;i<a_array.length;i++){
            System.out.println(i + " : " + a_array[i]);
        }
    }
}
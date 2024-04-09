package week6;

public class DateTest {
    public String[] yearMonthDay(String param){
        String[] arrayDate = param.split("-");
        arrayDate = null;
        if(param.length() == 10 && arrayDate.length == 3){
            arrayDate = param.split("-");
        }
        return arrayDate;
    }

    public int[] yearMonthDay2(String param){
        int[] arrayDate = new int[3];
        String[] paramString = yearMonthDay(param);
        for(int i=0;i<arrayDate.length;i++){
            arrayDate[i] = Integer.parseInt(paramString[i]);
        }
        return arrayDate;
    }

    public String whichIsRecent(String a, String b){
        String returnValue = "";
        String a1 = a.replaceAll("-", "");
        String b1 = b.replaceAll("-", "");
        int aa = Integer.parseInt(a1);
        int bb = Integer.parseInt(b1);
        //compareTo 같은 메서드를 사용해도 괜찮음!!
        if(aa >= bb){
            returnValue = a;
        } else {
            returnValue = b;
        }
        return returnValue;
    }
    //
    public String whichIsRecent(int a, int b){
        String returnValue = "";
        returnValue = whichIsRecent(a+"", b+"");
        return returnValue;
    }
}
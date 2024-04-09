package week6;

import week5.ListArray;
import week5.MapHash;
import week5.MapHash2;

import java.util.Date;

public class Study1 {
    public static void main(String[] args) {
        Car acar = new Car();
        acar.printData();
        acar.speedUp(10);
        acar.color = "red";
        acar.printData();

        /*
        int => Integer
        double => Double
        boolean => Boolean
         */
        String aString = "";
        String aDate = "2024-04-09";
        String bDate = "2024-04-11";
        DateTest dateTest = new DateTest();
        System.out.println(dateTest.whichIsRecent(aDate, bDate));

        //년도 랑 월이랑 일이랑 나눠서 각각 변수에 넣어볼께요!
        String[] arrayDate = aDate.split("-");
        String year = arrayDate[0];
        String month = arrayDate[1];
        String day = arrayDate[2];

        year = aDate.substring(0,4);
        month = aDate.substring(5,7);
        day = aDate.substring(8,10);

        //Date a = new Date();

        String key1 = "abcdefg";
        int intKey1 = key1.indexOf("a"); // 0
        intKey1 = key1.indexOf("1"); // -1


    }

}
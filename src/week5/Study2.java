package week5;

public class Study2 {
    public static void main(String[] args) {
        ListArray a = new ListArray();
        a.add(0);
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.printListArray();
        System.out.println(a.get(1));
        a.remove(2);
        a.printListArray();

        ListArray b = new ListArray();
        b.add("1");

        MapHash aa = new MapHash();
        aa.put("1", "111");
        aa.put("2", "211");
        aa.put("3", "23311");
        aa.printMapHash();
        aa.remove("2");
        aa.printMapHash();
        aa.remove("1");
        System.out.println(aa.get("3"));
        aa.printMapHash();


    }
}
public class Main {

    public static void main(String[] args) {
        MyHashMap<String, String> sozluk = new MyHashMap<String, String>();

        sozluk.put("pencil", "kalem");
        sozluk.put("table", "masa");
        sozluk.put("phone", "telefon");
        sozluk.put("door", "kapı");
        sozluk.list();
        System.out.println("---------------------------");

        System.out.println(sozluk.get("door"));

        sozluk.remove("table");
        sozluk.list();

        System.out.println(sozluk.size());
        sozluk.clear();
        System.out.println(sozluk.size());
    }
}
public class GarbageEx {
    public static void main(String[] args) {
        String a = new String("Good");
        String b = new String("Bad");
        String c = new String("Normal");
        String d, e;
        a = null; // a의 Good은 가비지 처리
        d = c;
        c = null;

    }
}

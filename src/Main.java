public class Main {
    public static void main(String[] args) {
        Flower flower1 = new Khatmi("Pink");
        Flower flower2 = (Flower) flower1.clone();
        System.out.println(flower2.color);


    }
}

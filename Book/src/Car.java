public class Car {
    String name;
    String color;
    String engineCC;
    void show() { System.out.println(name + " " + color + " " + engineCC); }

    public Car() {
        this("","","");
        System.out.println("선택한 자동차는"+ name + color + engineCC +"입니다.");
    }

    public Car(String name) {
        this(name, "RED", "2000CC"); //this(name, "RED", "2000cc");
    }

    public Car(String name, String color, String engineCC) {
        this.name = name; this.color = color; this.engineCC = engineCC;
    }
    public static void main(String[] args) {
        Car sonata = new Car("소나타", "BLACK","3000cc");
        Car granduer = new Car("그랜져", "WHITE","4000cc");
        Car avante = new Car("아반떼");
        granduer.show();
        avante.show();

    }
}

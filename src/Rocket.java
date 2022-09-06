public class Rocket extends Transport implements Flyable {
    @Override
    public void fly() {

    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDE80");
    }

    @Override
    public String draw3D(String material) {
        return "Rocket is drawed 3D"+ material;
    }
}

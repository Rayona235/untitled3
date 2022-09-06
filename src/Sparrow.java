public class Sparrow extends Animal2  implements Flyable,Drawable{
    @Override
    public void makeVoice() {
        System.out.println("chiiiiik-chirik");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow fly");
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDC08");
    }

    @Override
    public String draw3D(String material) {
        return "Sparrot is drawed 3D "+ material;
    }
}

public class Dog  extends Animal2 implements Drawable{


    @Override
    public void makeVoice() {
        System.out.println("Gav-gav");
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDC15");
    }

    @Override
    public String draw3D(String material) {
        return "Dog is drawed in 3D "+ material;
    }
}

public class Snake extends Repile implements Drawable{
    @Override
    public void makeVoice() {
        System.out.println("Cccccccccc............");
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDC0D");
    }

    @Override
    public String draw3D(String material) {
        return "Snake is drawed 3D "+material;
    }
}

public abstract class Animal2 {
    private int age;
    private Colour color;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Colour getColor() {
        return color;
    }

    public void setColor(Colour color) {
        this.color = color;
    }

    public abstract void makeVoice();
}


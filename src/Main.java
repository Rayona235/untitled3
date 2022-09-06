public class Main {
    public static void main(String[] args) {
        //абстракция это что то не конкретное
        Dog dog = new Dog();
        dog.makeVoice();
        dog.draw();
        System.out.println(dog.draw3D("Plastik"));

        Snake snake = new Snake();
        snake.makeVoice();
        snake.draw();
        System.out.println(snake.draw3D("Plastik"));

        Sparrow sparrow = new Sparrow();
        sparrow.makeVoice();
        sparrow.fly();
        sparrow.draw();
        System.out.println(sparrow.draw3D("Plastik"));


        Rocket rocket = new Rocket();
        rocket.draw();
        System.out.println(rocket.draw3D("Plastik"));

        System.out.println("...........");
        Drawable[] drawables = {snake, sparrow, dog, rocket};
        for (int i = 0; i < drawables.length; i++) {
            drawables[i].draw();
//            ((Snake) drawables[i]).makeVoice();
//            ((Animal2) drawables[i]).makeVoice();
            if (drawables[i] instanceof Animal2) {
                ((Animal2) drawables[i]).makeVoice();
            }
            if (drawables[i] instanceof Flyable) {
                ((Flyable) drawables[i]).fly();

            }

        }



    }
    public static void drawAll(Drawable object){
        object.draw();
        System.out.println( object.draw3D("PLastic"));
    }
}

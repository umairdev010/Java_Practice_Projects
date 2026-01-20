public class TrafficSignalsByThread {
    static void main(String[] args) {

        ThreadClassLights lights = new ThreadClassLights(Lights.GREEN,Lights.YELLOW,Lights.RED);

        lights.start();

    }
}

enum Lights {
    RED(5000),YELLOW(2000),GREEN(8000);

    private final int light;

    Lights(int numb) {
        this.light = numb;
    }

    public int getLight() {
        return light;
    }
}

class ThreadClassLights extends Thread{

    private final Lights color1;
    private final Lights color2;
    private final Lights color3;

    public ThreadClassLights(Lights color1,Lights color2,Lights color3) {
        this.color1 = color1;
        this.color2 = color2;
        this.color3 = color3;
    }

    synchronized void working(Lights color){
        System.out.printf("\n%s IS ACTIVE.",color);
        try {
            Thread.sleep(color.getLight());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("\n%s IS INACTIVE.",color);
    }

    @Override
    public void run() {
        working(color1);
        working(color2);
        working(color3);
    }
}
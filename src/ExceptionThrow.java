public class ExceptionThrow {
    int a;
    int b;

    ExceptionThrow(int a, int b) throws ExceptionMake {
        if (a == 0 || b == 0) throw new ExceptionMake("THIS ERROR IS CREATED BY UMAIR");
        this.a = a;
        this.b = b;
    }

    int sumOfNo() throws ExceptionMake {
        if (a != 0 && b != 0) throw new ExceptionMake("THIS ERROR IS CREATED BY UMAIR");
        return a + b;
    }

}

class ExceptionMake extends Exception {
    ExceptionMake(String message) {
        super(message);
    }
}

public class TestException {
    static void main(String[] args) {
        try {
            ExceptionThrow sumNo = new ExceptionThrow(0,5);
            System.out.print("NO ERROR OCURRED");
        } catch (ExceptionMake e) {
            System.out.printf("THE ERROR IS : %s",e.getMessage());
        }

    }

}

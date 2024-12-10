public class Main {
    public static void main(String[] args) {
        //initialize the class with integer daata
        DemoClass demo = new DemoClass();
        demo.genericsMethod(25); //passing int
        demo.genericsMethod("Per Scholas"); //passing string
        demo.genericsMethod(2563.5); //passing float
        demo.genericsMethod('H'); //passing char
    }
}
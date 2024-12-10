public class MyRunner {
    public static void main(String[] args) {

        DemoClass demo = new DemoClass();
        demo.genericsMethod(25); //passing int
        demo.genericsMethod("Per Scholas"); //passing string
        demo.genericsMethod(2563.5); //passing float
        demo.genericsMethod('H'); //passing char

        //initialize generic class with String and Integer
        GMultipleDatatype<String, Integer> mobj = new GMultipleDatatype("Per Scholas", 11025);
        System.out.println(mobj.getValueOne());
        System.out.println(mobj.getValueTwo());

        //initialize generic class with String and String
        GMultipleDatatype<String,String> mobj2 = new GMultipleDatatype("Per Scholas", "Non Profit");
        System.out.println(mobj2.getValueOne());
        System.out.println(mobj2.getValueTwo());

    }
}

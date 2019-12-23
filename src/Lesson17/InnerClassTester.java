package Lesson17;

public class InnerClassTester {

    public static void main(String[] args) {
        InnerClassTester innerClassTester = new InnerClassTester();
        //InnerClassForDemo innerClass = innerClassTester.new InnerClassForDemo("Test");
        InnerClassForDemo innerClass = new InnerClassForDemo("Test");
        System.out.println(innerClass.innerString);

    }


    //public class InnerClassForDemo {
    private static class InnerClassForDemo {
        private String innerString;

        public InnerClassForDemo(String innerString) {
            this.innerString = innerString;
        }
    }
}

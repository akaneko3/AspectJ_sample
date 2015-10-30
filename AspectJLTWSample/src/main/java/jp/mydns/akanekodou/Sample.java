package jp.mydns.akanekodou;

public class Sample {
    public static void main(String[] args) {
        Sample s = new Sample();
        System.out.println(s.hello());
    }

    public String hello() {
        return "Hello, AspectJ.";
    }
}

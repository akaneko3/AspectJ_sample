package jp.mydns.akanekodou;

public aspect SampleAspect {
    pointcut helloCut() :
        execution(public String Sample.hello(..));

    before() : helloCut() {
        System.out.println("Hey!!");
    }
}

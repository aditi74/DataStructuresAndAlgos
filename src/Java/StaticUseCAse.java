package Java;

/**
 * Created by 61310444 on 6/27/2016.
 */
public class StaticUseCAse {
    static int staticInteger;
    int nonStaticInteger;
    public static void useOfStaticMethod()
    {
        System.out.println("I am static method");
    }

    public static void main(String[] args) {
     useOfStaticMethod();
     staticInteger=10;
        System.out.println("Static integer "+ staticInteger);
      StaticUseCAse staticUseCAse= new StaticUseCAse();
        staticUseCAse.nonStaticInteger=11;
        System.out.println(staticUseCAse.nonStaticInteger);
    }
}

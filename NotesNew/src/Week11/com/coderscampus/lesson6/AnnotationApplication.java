package Week11.com.coderscampus.lesson6;

import java.lang.reflect.Method;

public class AnnotationApplication {
    public static void main(String[] args) {

        AnnotationApplicationTest testClass = new AnnotationApplicationTest();

        Method[] methods = AnnotationApplicationTest.class.getMethods();

        int testPassed = 0;
        int testFailed = 0;
        int testIgnored = 0;

        for (Method method : methods){
            MyTest myTest = method.getAnnotation(MyTest.class);

            if(myTest != null){
                try {
                    if (myTest.enabled()){
                        method.invoke(testClass);
                        testPassed++;
                    } else {
                        testIgnored++;
                    }                    
                } catch (Exception e) {
                    testFailed++;
                }
            }
        }
        System.out.println("Tests passed: " + testPassed + ", tests failed: "+ testFailed + ", tests ignored: " + testIgnored);
    }
}

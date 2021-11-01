package BT1;


public class ClassNameExampleTest {
    private static ClassNameExample classNameExample;

    public static final String[] validClassName = new String[] { "C0821K", "A0583I", "P8247H", "C0920M","P7438L" };
    public static final String[] invalidClassName = new String[] { "dsfdfjsfh", "AP9867J", "B9767C", "AJSHUFY" };

    public static void main(String[] args) {
        classNameExample = new ClassNameExample();
        for (String className : validClassName) {
            boolean isValid = classNameExample.validate(className);
            System.out.println("Class name " + className +" is valid: "+ isValid);
        }
        for (String className : invalidClassName) {
            boolean isValid = classNameExample.validate(className);
            System.out.println("Class name " + className +" is valid: "+ isValid);
        }
    }
}

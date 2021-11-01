package BT2;

import BT2.PhoneNumberExample;

public class PhoneNumberExampleTest {
    private static PhoneNumberExample phoneNumberExample;

    public static final String[] validPhoneNumber = new String[]{"(84)-(0978489648)", "(36)-(0273847368)", "(81)-(0317438764)", "(98)-(0909989090)", "(01)-(0237777222)"};
    public static final String[] invalidPhoneNumber = new String[]{"(09)-(736723876N)", "037974438284", "(03)-(NHUYJYHHJY)", "(98)-(099736763.)"};

    public static void main(String[] args) {
        phoneNumberExample = new PhoneNumberExample();
        for (String phoneNumber : validPhoneNumber) {
            boolean isValid = phoneNumberExample.validate(phoneNumber);
            System.out.println("Phone number " + phoneNumber + " is valid: " + isValid);
        }
        for (String phoneNumber : invalidPhoneNumber) {
            boolean isValid = phoneNumberExample.validate(phoneNumber);
            System.out.println("Phone number " + phoneNumber + " is valid: " + isValid);
        }
    }
}

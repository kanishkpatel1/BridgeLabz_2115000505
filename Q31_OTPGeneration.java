import java.util.*;

public class Q31_OTPGeneration {

    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }

    public static boolean areOTPsUnique(Set<Integer> otpSet) {
        return otpSet.size() == 10;
    }

    public static void main(String[] args) {
        Set<Integer> otpSet = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int otp = generateOTP();
            otpSet.add(otp);
        }

        if (areOTPsUnique(otpSet)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Some OTPs are duplicates.");
        }

        System.out.println("Generated OTPs: " + otpSet);
    }
}

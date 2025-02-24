class LegacyAPI {
    @Deprecated
    void oldFeature() {
        System.out.println("This is a deprecated method");
    }

    void newFeature() {
        System.out.println("This is a new method");
    }
}

public class Q02_Deprecated {
    public static void main(String[] args) {
        LegacyAPI obj = new LegacyAPI();
        obj.oldFeature();
        obj.newFeature();
    }
}

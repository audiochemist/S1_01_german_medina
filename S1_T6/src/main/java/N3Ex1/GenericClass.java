package N3Ex1;

public class GenericClass {

    public static <T extends Phone > void phoneMethods(T phone) {
        phone.toCall();

    }

    public static <T extends Smartphone > void smartphoneMethods(T smartphone) {
        smartphone.toCall();
        smartphone.takePictures();

    }
}

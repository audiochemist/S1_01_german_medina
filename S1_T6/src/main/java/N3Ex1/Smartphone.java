package N3Ex1;

public class Smartphone implements Phone {


    @Override
    public void toCall() {
    System.out.println("You're making a call");
    }
    public void takePictures(){
        System.out.println("You're taking a picture");

    }
}

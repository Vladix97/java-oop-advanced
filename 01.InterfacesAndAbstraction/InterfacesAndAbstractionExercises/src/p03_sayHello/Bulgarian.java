package p03_sayHello;

public class Bulgarian extends BasePerson {

    public Bulgarian(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Дай едно левче баткоо, жив и здрав да си!";
    }
}
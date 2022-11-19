public class Truck extends Transport {

    private String bodyType;

    public enum BodyType {

        N1(""),
        N2(""),
        N3("");

        private String type;

        BodyType(String type) {
            this.type=type;}

        public String getType() {
            return type;}

    }

    public Truck(String brand, String model, String color, String engineVolume) {
        super(brand,model,color,engineVolume);
    }

    public void startDrive() {
        System.out.println(getBrand()+" "+getModel()+" "+getColor()+" стартовал.");}

    @Override
    public void finishDrive() {

    }

    @Override
    public void refuel() {
        System.out.println(getBrand()+" "+getModel()+" "+getColor()+" заправлен.");}

}

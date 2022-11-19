
public class Car extends Transport implements Competing {

    private double bestLapTimeCar;
    private int maxSpeed;
    private String bodyType;

    public enum BodyType {
        SEDAN("седан"),
        HATCHBACK(""),
        COUPE("купе"),
        STATION_WAGON(""),
        SUV(""),
        CROSSOVER(""),
        PICKUP_TRUCK(""),
        VAN(""),
        MINIVAN("");

        private String type;

        BodyType(String type) {
            this.type=type;}

        public String getType() {
            return type;}

    }

    public Car(String brand, String model,BodyType bodyType, String color, String engineVolume) {
        super(brand,model,color,engineVolume);
        this.bodyType=bodyType.getType();
        this.bestLapTimeCar=100000;
        this.maxSpeed=320;
    }


    public void SetBestLapTime(Car car, Race race, double time) {
        Car a=(Car) car;
        Race b=(Race) race;
        if(time<a.getBestLapTimeCar()) {
        this.bestLapTimeCar=time;
        }
           if (time < b.bestLapTime) {
               b.setBestLapTime(time);}
    }


    public void carInfo() {
        System.out.println(getBrand()+" "+getModel()+" "+getColor()+" "+getBodyType()+".");
    }

    public String getBodyType() {
        return bodyType;}

    public double getBestLapTimeCar() {
        return bestLapTimeCar;}

    public int getMaxSpeed() {
        return maxSpeed;}

    @Override
    public void goTransport(Transport transport) {

    }

    public void setBestLapTimeCar(Race race, double bestLapTimeCar) {
        Race a=race;
        if (bestLapTimeCar<a.getBestLapTime()){
            a.setBestLapTime(bestLapTimeCar);
        }
        this.bestLapTimeCar = bestLapTimeCar;}


    public void bestLapTimeRace(Race race) {
        System.out.println(getBrand()+" "+getModel()+" "+getColor()+" самый быстрый круг: "+getBestLapTimeCar()+".");
        System.out.println("Рекорд круга: "+race.getBestLapTime()+".");
    }

    @Override
    public void startDrive() {
        System.out.println(getBrand()+" "+getModel()+" "+getColor()+" стартовал.");

    }

    @Override
    public void finishDrive() {
        System.out.println(getBrand()+" "+getModel()+" "+getColor()+" финишировал.");
    }

    @Override
    public void refuel() {System.out.println(getBrand()+" "+getModel()+" "+getColor()+" заправлен.");

    }

    @Override
    public void pitStop() {
        System.out.println(getBrand()+" "+getModel()+" "+getColor()+" заехал на Пит-стоп.");
    }

    @Override
    public void bestLapTime() {
        System.out.println(getBrand()+" "+getModel()+" "+getColor()+" самый быстрый круг: "+getBestLapTimeCar()+".");
    }

    @Override
    public void maxSpeed() {
        System.out.println(getBrand()+" "+getModel()+" "+getColor()+" развил максимальную скорость: "+getMaxSpeed()+" км/ч.");
    }
}

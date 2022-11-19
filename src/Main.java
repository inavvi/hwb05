public class Main {
    public static void main(String[] args) {

        Car murcielago=new Car("Lamborghini","Murcielago", Car.BodyType.COUPE,"оранжевый","6,19 л.");
        Car murcielagob=new Car("Lamborghini","Murcielago", Car.BodyType.COUPE,"белый","6,19 л.");
        Car murcielagoc=new Car("Lamborghini","Murcielago", Car.BodyType.COUPE,"красный","6,19 л.");
        Car lancer=new Car("Mitsubishi","Lancer Evolution VIII", Car.BodyType.SEDAN,"красный","2 л.");

        Bus tourismo=new Bus("Mercedes-Benz","Tourismo","оранжевый","11,98 л.");
        Bus tourismob=new Bus("Mercedes-Benz","Tourismo","белый","11,98 л.");
        Bus tourismoc=new Bus("Mercedes-Benz","Tourismo","красный","11,98 л.");
        Bus tourismod=new Bus("Mercedes-Benz","Tourismo","жёлтый","11,98 л.");

        Truck actros=new Truck ("Mercedes-Benz","Actros","оранжевый","11,94 л.");
        Truck actrosb=new Truck ("Mercedes-Benz","Actros","белый","11,94 л.");
        Truck actrosc=new Truck ("Mercedes-Benz","Actros","красный","11,94 л.");
        Truck actrosd=new Truck ("Mercedes-Benz","Actros","жёлтый","11,94 л.");

        Driver shumaher=new Driver("Михаэль Шумахер","Б");
        Driver ivanov=new Driver("Иван Иванов","Б, С");
        Driver ivanovs=new Driver("Сергей Иванов","Д");

        Lb b=new Lb("Б");
        Lc c=new Lc("С");
        Ld d=new Ld("Д");

        Race leman=new Race("Леман");

        murcielago.carInfo();
        lancer.carInfo();

        tourismo.startDrive();
        actros.startDrive();

        murcielagoc.pitStop();
        murcielago.finishDrive();
        murcielago.refuel();
        murcielago.setBestLapTimeCar(leman,180.48);
        murcielagob.setBestLapTimeCar(leman,178.21);
        murcielago.bestLapTimeRace(leman);

        b.goTransport(shumaher,murcielago);
        b.goTransport(shumaher,actrosd);
        b.goTransport(ivanov,murcielagob);
        c.goTransport(ivanov,actrosd);
        d.goTransport(ivanovs,tourismo);


    }
}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Car[] cars = input();
        Car fastest = Race.race(cars);
        System.out.println("Самая быстрая машина:");
        System.out.println(fastest.name);

    }

    public static Car[] input(){
        Scanner scanner = new Scanner(System.in);
        Car[] cars = new Car[3];
        double speed = 0;
        for (int i=0;i<3;i++){
            System.out.println("Введите название машины №"+ (i+1) + ":");
            String name = scanner.next();
            while (name.isEmpty()){
                System.out.println("Неккоректный ввод названии");
                System.out.println("Введите название машины №"+ (i+1) + ":");
                name = scanner.next();
            }
            while (true) {
                System.out.println("Введите скорость машины №"+ (i+1) + ":");
                if (scanner.hasNextDouble()){
                    speed = scanner.nextDouble();
                    if (speed > 250 || speed <0){
                        System.out.println("Неккоректный ввод скорости");
                    } else {
                        break;
                    }
                } else {
                    System.out.println("Неккоректный ввод скорости");
                }
            }

            cars[i] = new Car(name, speed);
        }
        return cars;
    }
}
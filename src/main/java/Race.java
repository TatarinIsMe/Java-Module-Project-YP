public class Race {
    public static Car race(Car[] cars){
        Car maxCar = new Car("", 0);
        double maxDist = 0;
        int maxIndex = -1;
        double[] distances = {0,0,0};
        for (int i=0;i<3;i++){
            distances[i] = cars[i].speed * 24;
        }
        for (int i = 0; i<3; i++){
            if (distances[i]>maxDist){
                maxIndex = i;
                maxDist = distances[i];
            }
        }
        return cars[maxIndex];
    }
}

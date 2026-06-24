class ParkingSystem {
    int[] cars = new int[3];
    public ParkingSystem(int big, int medium, int small) {
        cars[0] = big;
        cars[1] = medium;
        cars[2] = small;
    }
    
    public boolean addCar(int carType) {
        if(carType == 1){
            if(cars[0] >= 1){
                cars[0]--;
                return true;
            }
        }
        else if(carType == 2){
            if(cars[1] >= 1){
                cars[1]--;
                return true;
            }
        }
        if(carType == 3){
            if(cars[2] >= 1){
                cars[2]--;
                return true;
            }
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
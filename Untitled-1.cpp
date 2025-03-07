class ElectricCar : public Car {
public:
    int batteryLife;

    void setBattery(int b) {
        batteryLife = b;
    }

    void showDetails() {
        show(); // Calling base class method
        cout << "Battery Life: " << batteryLife << " hours" << endl;
    }
};


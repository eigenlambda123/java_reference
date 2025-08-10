class Car {
    // Private field
    private String model;

    // Getter method for model
    public String getModel() {
        return model;
    }

    // Setter method for model
    public void setModel(String model) {
        this.model = model;
    }
}

public class CarTestDrive {
    public static void main(String[] args) {
        Car myCar = new Car();

        // Set the model using the setter
        myCar.setModel("Toyota");

        // Get the model using the getter
        System.out.println("Car model: " + myCar.getModel());
    }
}


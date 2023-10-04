package Lab2.com.education.ztu.vehicles;

public class Car {
    private String brand;
    private Engine engine;

    public Car() {
        this.brand = "Doesn't have a car";
    }

    public Car(String brand) {
        this.brand = brand;
        this.engine = new Engine();
    }

    public boolean isEngineRunning() {
        return engine.isEngineWorks();
    }

    public String getInfo() {
        String engineStatus = isEngineRunning() ? "Running" : "Stopped";
        return "Brand: " + brand + "\nEngine Status: " + engineStatus;
    }

    class Engine {
        private boolean engineWorks;

        public Engine() {
            engineWorks = false;
        }

        public void startEngine() {
            engineWorks = true;
            System.out.println("Engine started.");
        }

        public void stopEngine() {
            engineWorks = false;
            System.out.println("Engine stopped.");
        }

        public boolean isEngineWorks() {
            return engineWorks;
        }
    }
}

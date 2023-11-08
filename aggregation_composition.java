package collections;

import java.util.ArrayList;
import java.util.List;

 

class Component {
    private String name;

 

    public Component(String name) {
        this.name = name;
    }

 

    public String getName() {
        return name;
    }
}

 

class Software {
    private String name;

 

    public Software(String name) {
        this.name = name;
    }

 

    public String getName() {
        return name;
    }
}

 

class Computer {
    private String brand;
    private List<Component> components;
    private Software operatingSystem;

 

    public Computer(String brand) {
        this.setBrand(brand);
        components = new ArrayList<>();
    }

 

    public void addComponent(Component component) {
        components.add(component);
    }

 

    public List<Component> getComponents() {
        return components;
    }

 

    public void installOperatingSystem(Software os) {
        operatingSystem = os;
    }

 

    public Software getOperatingSystem() {
        return operatingSystem;
    }



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}
}

 

public class aggregation_composition {
    public static void main(String[] args) {
        // Create a computer
        Computer computer = new Computer("Fictional Brand");

 

        // Create components
        Component cpu = new Component("CPU");
        Component ram = new Component("RAM");
        Component storage = new Component("Storage");

 

        // Add components to the computer
        computer.addComponent(cpu);
        computer.addComponent(ram);
        computer.addComponent(storage);

 

        // Create software applications
        Software windows = new Software("Windows 10");
        Software office = new Software("Microsoft Office");

 

        // Install an operating system and software on the computer
        computer.installOperatingSystem(windows);

 

        // Display computer configuration
        System.out.println("Computer: " + computer.getBrand());
        System.out.println("Components:");
        for (Component component : computer.getComponents()) {
            System.out.println("  - " + component.getName());
        }
        System.out.println("Operating System: " + computer.getOperatingSystem().getName());
    }
}
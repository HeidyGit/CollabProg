package P3AbstractFactoryPattern.Ex2_CarProgram.cars;

public abstract  class Car {
	protected String name;
    private String color;

	public String getName() {
		return name;
	}

    public String getColor() {
        return color;
    }

    public void installEngine() {
        System.out.println("Car " + name + " : Engine is installed.");
    }

    public void addExtras() {
        System.out.println("Car " + name + " : Extras are added");
    }
    
    public void paint(String color) {
        this.color = color;
        System.out.println("Car " + name + " : car is painted in color " + color);
    }

    @Override
	public String toString() {
        return "---- " + name + " ----\n";
	}
}

package ExamPreparation.State.SolarPanel;
import java.util.Random;


/**
 * @author  scz
 */
public abstract class State {
	static protected ProductionLevel currentProductionLevel = ProductionLevel.low;
	protected SolarInfrastructure solarInfrastructure;

    private Random rnd = new Random();

	public abstract void on();
	public abstract void off();
	public abstract void compute();
	
    protected ProductionLevel defineRandomProductionLevel() {
    	return ProductionLevel.values()[rnd.nextInt(3)];
    }
	
}

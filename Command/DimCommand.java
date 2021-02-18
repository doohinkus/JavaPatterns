package Command;

public class DimCommand implements Command{
    private Light light;
    public DimCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        this.light.dim();
    }
}

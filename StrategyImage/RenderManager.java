package StrategyImage;

public class RenderManager implements Renderer{
    private Renderer renderer;
    public void setRenderer(Renderer renderer){
        this.renderer = renderer;
    }
    @Override
    public void render(){
        this.renderer.render();
    }
}

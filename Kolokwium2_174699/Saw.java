abstract public class Saw extends WorkTool {
    public Saw(String name, int productionYear) {
        super(productionYear, name);
    }

    public void use(){System.out.println("Użyto Saw");}
}

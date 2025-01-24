abstract public class Screwdriver extends WorkTool {
    public Screwdriver(String name, int productionYear) {
        super(productionYear, name);
    }

    public void use(){System.out.println("Użyto Screwdriver");}
}

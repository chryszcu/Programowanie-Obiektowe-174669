abstract public class WorkTool {
    private String name;
    private int productionYear;

    public WorkTool(int productionYear, String name) {
        this.productionYear = productionYear;
        this.name = name;
    }

    abstract public void use();
}

abstract public class Hammer extends WorkTool{
    public Hammer(String name, int productionYear){
        super(productionYear, name);
    }

    public void use(){System.out.println("Użyto młotka");}


}

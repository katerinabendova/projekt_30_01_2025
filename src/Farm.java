public class Farm {
    private int barnSize;
    private int bigA;
    private int smallA;
    protected String species;
    protected String name;
    protected Size size;
    protected boolean specialCare;
    protected int happiness;

    public void setBarnSize(int barnSize) {
        this.barnSize = 20;
    }

    public void setSmallA(int smallA) {
        this.smallA = 10;
    }

    public void setBigA(int bigA) {
        this.bigA = 10;
    }

    public Farm(int barnSize, int bigA, int smallA, String species, String name, Size size, boolean specialCare) {
        this.barnSize = barnSize;
        this.bigA = bigA;
        this.smallA = smallA;
        this.species = species;
        this.name = name;
        this.size = size;
        this.specialCare = specialCare;
    }

    public int feeding(int happiness){
        return happiness +5;

    }

    public int playing(){
        return happiness +10;
    }

}

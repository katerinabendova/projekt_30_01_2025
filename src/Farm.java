public class Farm {
    private int barnSize;
    private int bigA;
    private int smallA;


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

    }



}

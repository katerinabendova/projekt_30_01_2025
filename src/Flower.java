public abstract class Flower {

    protected String name;
    protected double price;
    protected double neededArea;
    protected double chanceOfGrowth;
    protected int plantNumber;
    protected double plotSize;
    protected double freePlace;
    protected int growth;

    public void setPlotSize(double plotSize) {
        this.plotSize = 10000; //m^2
    }

    public void setPlantNumber(int plantNumber) {
        this.plantNumber = 5;
    }

    public void setFreePlace(double freePlace) {
        this.freePlace = plotSize -= neededArea;
    }

    public boolean addPlant( int plantNumber, double freePlace){

        if (freePlace == 0) {
            return false;
        }
        if (plantNumber >= 5){
            return false;
        }
        return true;
    }

    public int watering(int growth){
        return growth++;
    }

    public double harvesting(double freePlace, int growth, double neededArea){
        if (growth == 10){
            return freePlace + neededArea;
        }
        return 0;
    }



    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", neededArea=" + neededArea +
                ", chanceOfGrowth=" + chanceOfGrowth +
                '}';
    }

}

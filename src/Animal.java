public abstract class Animal {

    protected String type;
    protected String name;
    protected Size size;
    protected String specialCare;
    protected int happiness;

    public Animal(String type, String name, int happiness, Size size, String specialCare) {
        this.type = type;
        this.name = name;
        this.happiness = happiness;
        this.size = size;
        this.specialCare = specialCare;
    }
    /**
     * method for feeding animals
     * @param happiness
     * @return happiness is 5 more
     */
    public int feeding(int happiness){
        return happiness +5;

    }

    /**
     * method for playing with animals
     * @param happiness
     * @return happiness is 10 more
     */
    public int playing(int happiness){
        return happiness +10;
    }
    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", specialCare='" + specialCare + '\'' +
                '}';
    }
}

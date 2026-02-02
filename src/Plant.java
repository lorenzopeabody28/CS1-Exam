public class Plant {
    public int numWeeksOld;
    public String color;
    public boolean isEdible;
    public Plant(int numWeeksOld, String color, boolean isEdible){
        this.numWeeksOld = numWeeksOld;
        this.color = color;
        this.isEdible = isEdible;
    }
    public void printInfo(){
        System.out.println("The plant is " + numWeeksOld + " weeks old.");
        System.out.println("The plant is " + color + ".");
        System.out.println("It is " + isEdible + " that the plant is edible.");
    }
}

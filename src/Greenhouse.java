import javax.print.attribute.standard.PrinterInfo;

public class Greenhouse {
    public String name;
    public boolean sprinklersOn;
    public int numberOfFlowers;

    public static void main(String[] args) {
        Greenhouse greenhouse = new Greenhouse();
    }
    public Greenhouse() {
        System.out.println("Hello World! Good luck on your exams!");
        name = "Planting Parameters at the CSG";
        sprinklersOn = true;
        numberOfFlowers = 31;
        System.out.println("Welcome to " + name + "! It is " + sprinklersOn + " that we are watering plants right now. We have " + numberOfFlowers + " flowers!");
        numberOfFlowers = 13;
        System.out.println("Welcome to " + name + "! It is " + sprinklersOn + " that we are watering plants right now. We have " + numberOfFlowers + " flowers!");

        randomReplant();

        veggieOfTheDay("Carot");

        countFlowers();

        changeTemperature();

        Plant kimPlant = new Plant(3, "orange",true);
        kimPlant.printInfo();

        Plant myplant = new Plant(2, "blue", true);
        myplant.printInfo();

        starTriangle(7);

        perimeterTriangle(7);
    }
    public void randomReplant(){
        int randomInt;
        randomInt = (int)(Math.random()*16);
        System.out.println("We are replanting " + randomInt + " vegetables today!");
    }
    public void veggieOfTheDay(String veggie){
        System.out.println("Today's chosen veggie is " + veggie + ".");
    }
    public void countFlowers(){
        for(int x = 2; x < 7; x=x+1){
            System.out.println(x);
        }
        for (int y = 20; y< 111; y=y+30){
            System.out.println(y);
        }
        for (int z = 8; z >= 0; z=z-1){
            System.out.print(z + ", ");
        }
        System.out.println();
    }
    public void changeTemperature(){
        double randomNum;
        randomNum = (Math.random());
        if(randomNum < .25){
            System.out.println("The temperature has decreased by 2 degrees.");
        }
        else if(randomNum >= .25 && randomNum <.5){
            System.out.println("The temperature has decreased by 1 degree.");
        }
        else if(randomNum >= .5 && randomNum < .75){
            System.out.println("The temperature has increased by 1 degree.");
        }
        else{
            System.out.println("The temperature has increased by 2 degrees.");
        }

    }
    public void starTriangle(int size){
        if(size == 3){
            System.out.println("*");
            System.out.println("* *");
            System.out.println("* * *");
        }
        else if(size == 5){
            System.out.println("*");
            System.out.println("* *");
            System.out.println("* * *");
            System.out.println("* * * *");
            System.out.println("* * * * *");
        }
        else if(size == 7){
            System.out.println("*");
            System.out.println("* *");
            System.out.println("* * *");
            System.out.println("* * * *");
            System.out.println("* * * * *");
            System.out.println("* * * * * *");
            System.out.println("* * * * * * *");
        }
    }
        public void perimeterTriangle(int size){

            if(size == 3){
                System.out.println("-");
                System.out.println("- -");
                System.out.println("- - -");
            }
            else if(size == 5){
                System.out.println("-");
                System.out.println("- -");
                System.out.println("- * -");
                System.out.println("- * * -");
                System.out.println("- - - - -");
            }
            else if(size == 7){
                System.out.println("-");
                System.out.println("- -");
                System.out.println("- * -");
                System.out.println("- * * -");
                System.out.println("- * * * -");
                System.out.println("- * * * * -");
                System.out.println("- - - - - - -");
            }
        }
        }



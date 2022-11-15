public class Match {

    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1,Fighter f2,int maxWeight,int minWeight){

        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;
    }

    public void fight(){
        if(weightControl()) {
            if (firstStart()) {
                int count=0;
                while (f1.health >= 0 && f2.health >= 0) {
                    count++;
                    System.out.println("***** ROUND "+count+" *****");
                    if (f2.dodgeChance()) {
                        System.out.println(f2.name + " Dodged!");
                    } else {
                        f2.health -= f1.hitPower;
                        System.out.println(f1.name + " HİT! " + f1.hitPower);
                    }
                    printScoreBoard();
                    System.out.println("-----------------");
                    if(isWin()){
                        break;
                    }
                    if (f1.dodgeChance()) {
                        System.out.println(f1.name + " Dodged!");
                    } else {
                        f1.health -= f2.hitPower;
                        System.out.println(f2.name + " HİT! " + f2.hitPower);
                    }
                    printScoreBoard();
                    if(isWin()){
                        break;
                    }
                    System.out.println("*******************");
                }
            }else{
                int count=0;
                while (f1.health >= 0 && f2.health >= 0) {
                    count++;
                    System.out.println("***** ROUND "+count+" *****");
                    if (f1.dodgeChance()) {
                        System.out.println(f1.name + " Dodged!");
                    } else {
                        f1.health -= f2.hitPower;
                        System.out.println(f2.name + " HİT! " + f2.hitPower);
                    }
                    printScoreBoard();
                    System.out.println("-----------------");
                    if(isWin()){
                        break;
                    }
                    if (f2.dodgeChance()) {
                        System.out.println(f2.name + " Dodged!");
                    } else {
                        f2.health -= f1.hitPower;
                        System.out.println(f1.name + " HİT! " + f1.hitPower);
                    }
                    printScoreBoard();
                    if(isWin()){
                        break;
                    }
                    System.out.println("*******************");
                }
            }


        }else{
            System.out.println("Opponents are not in the same weight category!");

        }
    }

    public boolean weightControl(){
        if(f1.weight>=minWeight&&f1.weight<=maxWeight&&f2.weight>=minWeight&&f2.weight<=maxWeight){
            return true;
        }else{
            return false;
        }
    }

    public boolean firstStart(){
        double randomValue = Math.random() * 100;
        if (randomValue < 50){
            return true;
        }
        return false;
    }

    public boolean isWin(){
        if(f1.health<=0){
            f1.health=0;
            System.out.println(f2.name+" WIN ");
            return true;
        }
        if(f2.health<=0) {
            f2.health = 0;
            System.out.println(f1.name + " WIN ");
            return true;
        }
        return false;
    }

    void printScoreBoard(){
        System.out.println(f1.name+" health : "+f1.health+"\n"+f2.name+" health : "+f2.health);
    }

}

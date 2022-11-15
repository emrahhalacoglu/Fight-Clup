public class Fighter {
    String name;
    int health;
    int hitPower;
    int weight;
    int dodge;

    public Fighter(String name,int health,int hitPower,int weight,int dodge){
        this.name=name;
        this.health=health;
        this.hitPower=hitPower;
        this.weight=weight;
        this.dodge=dodge;

    }

    public boolean dodgeChance(){
        double randomValue = Math.random() * 100;
        if (randomValue <= dodge){
            return true;
        }
        return false;
    }

}

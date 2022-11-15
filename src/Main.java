public class Main {
    public static void main(String[] args) {

        Fighter MA=new Fighter("Muhammet Ali Clay",150,15,120,70);
        Fighter MT=new Fighter("Mike Tyson",120,30,115,30);

        Match GoldenGlove=new Match(MA,MT,150,100);

        GoldenGlove.fight();

    }


}

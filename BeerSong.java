public class BeerSong{
    public static void main(String[] args){
        Ninety_Nine_Bottles_of_Beer();
    }

    public static void Ninety_Nine_Bottles_of_Beer(){
        int i = 99;
        while(i > 2){
            System.out.println(i + " bottles of beer on the wall, " + i-- + " bottles of beer");
            System.out.println("Take one down, pass it around, " + i + " bottles of beer on the wall.");        
        }
        System.out.println("2 bottles of beer on the wall, 2 bottles of beer");
        System.out.println("Take one down, pass it around, 1 bottle of beer on the wall.");
        System.out.println("1 bottle of beer on the wall, 1 bottle of beer");
        System.out.println("Take one down, pass it around, no more bottles of beer on the wall.");
    }
}
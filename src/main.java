public class main {
    public static void main(String[] args) {

        Hero mega = new Hero("mega", 10,100);
        HeroStrength mendung = new HeroStrength("mendung",20,100);
        HeroIntel tuhul = new HeroIntel("tuhul", 25, 100, 10);
        HeroAgi owi = new HeroAgi("Owi",30,100);

        Hero[] kumpulanHero = new Hero[4];
        kumpulanHero [0] = mega;
        kumpulanHero [1] = mendung;
        kumpulanHero [2] = tuhul;
        kumpulanHero [3] = owi;

        int leng = kumpulanHero.length;
        for(int i = 0; i <= leng - 1; i++){
            kumpulanHero[i].display();
        }
        kumpulanHero[3].ngeBuff();
        mendung.attack(tuhul);
        leng = kumpulanHero.length;
        for(int i = 0; i <= leng - 1; i++){
            kumpulanHero[i].display();
        }
    }
}
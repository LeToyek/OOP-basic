public class HeroAgi extends Hero{
    String type= "Agility";
    HeroAgi (String name,double damage,double health){
        super(name,damage,health);
    }

    @Override
    void display() {
        super.display();
        System.out.println("Type\t: " + this.type);
    }

}

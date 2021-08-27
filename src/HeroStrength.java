public class HeroStrength extends Hero{
    String type = "Strength";
    HeroStrength (String nameIn, double damageIn, double healthIn){
        super(nameIn,damageIn,healthIn);
    }

    @Override
    void display() {
        super.display();
        System.out.println("Type\t: " + this.type);
    }

    @Override
    void takeDamage(double damage) {
        System.out.println(this.name + " recieve damage " + damage + "->" + 0.5*damage);
        this.health = this.health - 0.5*damage;
    }
}

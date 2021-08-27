public class HeroIntel extends Hero{
    String type = "Intelligent";
    HeroIntel(String nameInput, double damageInput, double healthInput,double healInput){
        super(nameInput,damageInput,healthInput);
        this.heal = healInput;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Type\t: " + this.type);
    }

    @Override
    void takeDamage(double damage) {
        System.out.println(this.name + " recieve damage " + 2*damage);
        this.health = this.health - 2*damage;
    }

    @Override
    void heal(Hero Ally) {
        System.out.println("\n" + this.name + " heal " + Ally.name);
        Ally.giveHealth(this.heal);
    }
    void showOff (){
        System.out.println("I'm Intelligent");
    }
}

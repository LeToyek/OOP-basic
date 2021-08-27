public class Hero {
    String name;
    double damage,health,heal;
    double upDamage = 10;

    Hero(String name,double damage, double health){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.heal = heal;
        this.upDamage = upDamage;
    }
    void attack(Hero enemy){
        System.out.println("\n" + this.name + " attack " + enemy.name);
        enemy.takeDamage(this.damage);
    }
    void takeDamage(double damage){
        System.out.println(this.name + " recieve damage " + damage);
        this.health = this.health - damage;
    }
    void heal(Hero Ally){
        System.out.println("\n" + this.name + " healing " + Ally.name);
        Ally.giveHealth(this.heal);
    }
    void giveHealth(double heal){
        System.out.println(this.name + " recieve health " + heal);
        this.health = this.health + heal;
    }
    void ngeBuff(){
        System.out.println(this.name + "'s damage has increased to " + upDamage);
        this.damage = this.damage + upDamage;
    }
    void display(){
        System.out.println("\nName\t: " + this.name);
        System.out.println("Damage\t: " + this.damage);
        System.out.println("health\t: " + this.health);
    }
}

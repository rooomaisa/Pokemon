public abstract class Pokemon {
   private String name;
   private int level;
   private int hp;
   private int xp;
   private String type;

    public Pokemon(String name, int level, int hp, int xp, String type) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.xp = xp;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public int getXp() {
        return xp;
    }

    public String getType() {
        return type;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void gainXp(int amount) {
        this.xp += amount;
    }






    public void eats(){
        System.out.println("your pokemon" + name + " is eating");
    }

    public void speaks(){
        System.out.println("your pokemon " + name + " is speaking");
    }

    public abstract void attack(Pokemon opponent);
    public abstract void  defend();

}

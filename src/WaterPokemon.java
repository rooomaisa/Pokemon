public class WaterPokemon extends Pokemon {
    private int waterShield;
    private int hydrationLevel;


    public WaterPokemon(String name, int level, int hp, int xp, String type, int waterShield, int hydrationLevel) {
        super(name, level, hp, xp, type);
        this.waterShield = waterShield;
        this.hydrationLevel = hydrationLevel;
    }


    public int getWaterShield() {
        return waterShield;
    }

    public void setWaterShield(int waterShield) {
        this.waterShield = waterShield;
    }


    public int getHydrationLevel() {
        return hydrationLevel;
    }

    public void setHydrationLevel(int hydrationLevel) {
        this.hydrationLevel = hydrationLevel;
    }


    @Override
    public void attack(Pokemon opponent) {
        System.out.println(getName() + " attacks " + opponent.getName() + " with Hydro Pump!");
        int damage = 15 + waterShield;
        opponent.setHp(opponent.getHp() - damage);
        System.out.println(opponent.getName() + " loses " + damage + " HP! Remaining HP: " + opponent.getHp());
        gainXp(15);
        System.out.println(getName() + " gained 15 XP!");
    }

    @Override
    public void defend() {
        System.out.println(getName() + " uses a water barrier to defend!");
    }


    public void splash() {
        System.out.println(getName() + " splashes water everywhere!");
    }
}

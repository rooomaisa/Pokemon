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
    public void attack() {
        super.attack();
        System.out.println(getName() + " uses Hydro Pump! It’s super effective!");
        setXp(getXp() + 20);
        System.out.println(getName() + " gained an additional 20 XP! Total XP: " + getXp());
    }


    public void splash() {
        System.out.println(getName() + " splashes water everywhere!");
    }
}

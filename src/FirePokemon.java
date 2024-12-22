public class FirePokemon extends Pokemon {
    private int fireResistance;
    private int flameIntensity;

    public FirePokemon (String name, int level, int hp, int xp, String type, int fireResistance, int flameIntensity) {
        super(name, level, hp, xp, type);
        this.fireResistance = fireResistance;
        this.flameIntensity = flameIntensity;
    }



    public int getFireResistance() {
        return fireResistance;
    }

    public void setFireResistance(int fireResistance) {
        this.fireResistance = fireResistance;
    }

    public int getFlameIntensity() {
        return flameIntensity;
    }

    public void setFlameIntensity(int flameIntensity) {
        this.flameIntensity = flameIntensity;
    }


    @Override
    public void attack() {
        System.out.println(getName() + " uses Fire Lash! It’s super effective!");
        setXp(getXp() + 20);
        System.out.println(getName() + " gained an additional 20 XP! Total XP: " + getXp());
    }

    @Override
    public void defend() {
        System.out.println(getName() + " uses a flame shield to defend!");
        setXp(getXp() + 10);
        System.out.println(getName() + " gained 10 XP for defending! Total XP: " + getXp());
    }


    public void ignite() {
        System.out.println(getName() + " ignites the battlefield with flames!");
    }
}




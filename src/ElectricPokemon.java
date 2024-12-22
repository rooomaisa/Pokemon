
    public class ElectricPokemon extends Pokemon {
        private int electricCharge;
        private int voltage;


        public ElectricPokemon(String name, int level, int hp, int xp, String type, int electricCharge, int voltage) {
            super(name, level, hp, xp, type);
            this.electricCharge = electricCharge;
            this.voltage = voltage;
        }


        public int getElectricCharge() {
            return electricCharge;
        }

        public void setElectricCharge(int electricCharge) {
            this.electricCharge = electricCharge;
        }


        public int getVoltage() {
            return voltage;
        }

        public void setVoltage(int voltage) {
            this.voltage = voltage;
        }


        @Override
        public void attack() {
            super.attack();
            System.out.println(getName() + " uses Thunder! It’s super effective!");
            setXp(getXp() + 20);
            System.out.println(getName() + " gained an additional 20 XP! Total XP: " + getXp());
        }


        public void charge() {
            System.out.println(getName() + " is charging up for a massive attack!");
        }
    }




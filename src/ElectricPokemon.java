
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
        public void attack(Pokemon opponent) {
            System.out.println(getName() + " attacks " + opponent.getName() + " with Thunderbolt!");
            int damage = 25 + electricCharge;
            opponent.setHp(opponent.getHp() - damage);
            System.out.println(opponent.getName() + " loses " + damage + " HP! Remaining HP: " + opponent.getHp());
            gainXp(25);
            System.out.println(getName() + " gained 25 XP!");
        }

        @Override
        public void defend() {
            System.out.println(getName() + " uses an electric barrier to defend!");
            System.out.println(getName() + "'s barrier absorbs part of the damage!");
        }



        public void charge() {
            System.out.println(getName() + " is charging up for a massive attack!");
        }
    }




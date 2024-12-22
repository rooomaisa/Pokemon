
    public class GrassPokemon extends Pokemon {
        private int leafSharpness;
        private int chlorophyll;


        public GrassPokemon(String name, int level, int hp, int xp, String type, int leafSharpness, int chlorophyll) {
            super(name, level, hp, xp, type);
            this.leafSharpness = leafSharpness;
            this.chlorophyll = chlorophyll;
        }


        public int getLeafSharpness() {
            return leafSharpness;
        }

        public void setLeafSharpness(int leafSharpness) {
            this.leafSharpness = leafSharpness;
        }


        public int getChlorophyll() {
            return chlorophyll;
        }

        public void setChlorophyll(int chlorophyll) {
            this.chlorophyll = chlorophyll;
        }


        @Override
        public void attack(Pokemon opponent) {
            System.out.println(getName() + " attacks " + opponent.getName() + " with Leaf Blade!");
            int damage = 20 + leafSharpness;
            opponent.setHp(opponent.getHp() - damage);
            System.out.println(opponent.getName() + " loses " + damage + " HP! Remaining HP: " + opponent.getHp());
            gainXp(20);
            System.out.println(getName() + " gained 20 XP!");
        }

        @Override
        public void defend() {
            System.out.println(getName() + " uses a healing effect to restore HP!");
            int heal = 15;
            setHp(getHp() + heal);
            System.out.println(getName() + " restored " + heal + " HP! Current HP: " + getHp());
        }


        public void photosynthesize() {
            System.out.println(getName() + " is photosynthesizing to restore energy!");
        }
    }



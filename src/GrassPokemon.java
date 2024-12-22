
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
        public void attack() {
            super.attack(); // Call the super class attack method
            System.out.println(getName() + " uses Leaf Storm! It’s super effective!");
            setXp(getXp() + 20); // Add extra XP for type-specific behavior
            System.out.println(getName() + " gained an additional 20 XP! Total XP: " + getXp());
        }


        public void photosynthesize() {
            System.out.println(getName() + " is photosynthesizing to restore energy!");
        }
    }



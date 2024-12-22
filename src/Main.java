//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", 5, 25, 25, "Electric", 15, 25);
        FirePokemon charmander = new FirePokemon("Charmander", 5, 25, 25, "Fire", 10, 15);
        WaterPokemon squirtle = new WaterPokemon("Squirtle", 5, 30, 20, "Water", 8, 18);
        GrassPokemon bulbasaur = new GrassPokemon("Bulbasaur", 5, 35, 15, "Grass", 12, 10);

        pikachu.eats();
        charmander.eats();
        squirtle.speaks();
        bulbasaur.speaks();

        squirtle.attack();
        charmander.ignite();

        charmander.defend();


    }
}
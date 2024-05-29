package kg.geeks.game.players;


public class Ludoman extends Hero {

    public Ludoman(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        Random rand = new Random();
        System.out.println(" random number");


        if (dice1 == dice2) {
            int Boss = dice1 * dice2;
            boss.setHealth(boss.getHealth() - Boss);
            System.out.println("они совпадают");
        } else {
            int damage = dice1 + dice2;
            Hero random = heroes[rand.nextInt(heroes.length)];
            while (random == this || random.getHealth() <= 0) {
                random = heroes[random.nextInt(heroes.length)];
            }
            random.setHealth(random.getHealth() - damage);
            System.out.println("не сопадают");

        }
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

    }

    @Override
    public void applySuperPower(Ludoman ludoman, Hero[] heroes) {

    }
}

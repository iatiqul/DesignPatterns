package tests;

import bridge.players.Enemy;
import bridge.players.Hero;
import bridge.players.Player;
import bridge.weapons.Arrow;
import bridge.weapons.Sword;
import bridge.weapons.Weapon;

public class BridgePatternTest implements Tester {
    public void test(){
        Weapon sword = new Sword();
        Weapon arrow = new Arrow();

        Player enemy = new Enemy();
        Player hero = new Hero();

        enemy.setWeapon(sword);
        hero.setWeapon(sword);

        enemy.fight();
        hero.fight();

        enemy.setWeapon(arrow);
        hero.setWeapon(arrow);

        enemy.fight();
        hero.fight();
    }
}

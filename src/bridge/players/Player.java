package bridge.players;

import bridge.weapons.Weapon;

public class Player {
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void fight(){
        weapon.launch();
    }
}

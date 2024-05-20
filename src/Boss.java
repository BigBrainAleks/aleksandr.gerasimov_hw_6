public class Boss extends GameEntity {
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void printInfo() {
        System.out.println("Boss Health: " + getHealth());
        System.out.println("Boss Damage: " + getDamage());
        System.out.println("Boss Weapon: " + weapon.getNameOfTheWeapon() + " (Type: " + weapon.getWeaponType() + ")");
    }
}


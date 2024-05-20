public class Main {
    public static void main(String[] args) {
        // Создание экземпляра босса и установка свойств
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(50);

        Weapon bossWeapon = new Weapon();
        bossWeapon.setWeaponType(WeaponType.SWORD);
        bossWeapon.setNameOfTheWeapon("Excalibur");
        boss.setWeapon(bossWeapon);

        // Вывод информации о боссе
        boss.printInfo();
        System.out.println();

        // Создание и заполнение данными двух экземпляров Skeleton
        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealth(150);
        skeleton1.setDamage(15);
        skeleton1.setArrowCount(20);

        Weapon skeletonWeapon1 = new Weapon();
        skeletonWeapon1.setWeaponType(WeaponType.BOW);
        skeletonWeapon1.setNameOfTheWeapon("Bone Bow");
        skeleton1.setWeapon(skeletonWeapon1);

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealth(100);
        skeleton2.setDamage(10);
        skeleton2.setArrowCount(15);

        Weapon skeletonWeapon2 = new Weapon();
        skeletonWeapon2.setWeaponType(WeaponType.BOW);
        skeletonWeapon2.setNameOfTheWeapon("Shadow Bow");
        skeleton2.setWeapon(skeletonWeapon2);

        // Вывод информации о скелетах
        skeleton1.printInfo();
        System.out.println();
        skeleton2.printInfo();
    }
}

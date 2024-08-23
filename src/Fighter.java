public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    public Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    // Saldırı işlemi
    public int hit(Fighter foe) {
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu.");
        if (foe.dodge()) {
            System.out.println(foe.name + " gelen hasarı savurdu.");
            return foe.health; // Eğer savurduysa hasar almıyor.
        }

        // Eğer hasar canı sıfırın altına düşürürse, sıfır yapalım
        if (foe.health - this.damage < 0) {
            return 0;
        }

        return foe.health - this.damage;
    }

    // Savunma yeteneği
    public boolean dodge() {
        double randomValue = Math.random() * 100; // 0-99.9 arasında rastgele bir sayı
        return randomValue <= this.dodge;  // Eğer bu sayı dodge şansına eşit veya küçükse kaçınır
    }
}

public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    // Maçın başlaması
    public void startFight() {
        if (checkWeight()) {
            // Eğer kilolar uyuyorsa, yazı tura atarak kimin başlayacağını belirleyelim
            Fighter first;
            Fighter second;
            if (Math.random() < 0.5) {
                first = f1;
                second = f2;
            } else {
                first = f2;
                second = f1;
            }
            System.out.println(first.name + " maça başlıyor!");

            // Maç başlasın
            fight(first, second);
        } else {
            System.out.println("Sporcuların kiloları uyuşmuyor. Maç iptal edildi.");
        }
    }

    // Turn-based dövüş
    private void fight(Fighter first, Fighter second) {
        int round = 1;

        while (first.health > 0 && second.health > 0) {
            System.out.println("\n======== Round " + round + " ========");

            // İlk saldıran
            second.health = first.hit(second);

            if (second.health == 0) {
                System.out.println("Maçı Kazanan: " + first.name);
                break;
            }

            // İkinci saldıran
            first.health = second.hit(first);

            if (first.health == 0) {
                System.out.println("Maçı Kazanan: " + second.name);
                break;
            }

            // Skor durumu
            printScore(first, second);
            round++;
        }
    }

    // Kilo kontrolü
    private boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) &&
                (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    // Skoru yazdırma
    private void printScore(Fighter f1, Fighter f2) {
        System.out.println(f1.name + " Kalan Can: " + f1.health);
        System.out.println(f2.name + " Kalan Can: " + f2.health);
    }
}

public class Combat {
    private Fighter f1;
    private Fighter f2;
    private Fighter first;  // İlk saldırıyı yapacak olan dövüşçü
    private Fighter second; // İkinci saldırıyı yapacak olan dövüşçü

    public Combat(Fighter f1, Fighter f2) {
        this.f1 = f1;
        this.f2 = f2;

        // Maç başında %50 ihtimalle kimin başlayacağını belirleyelim
        if (Math.random() < 0.5) {
            this.first = f1;
            this.second = f2;
        } else {
            this.first = f2;
            this.second = f1;
        }
        System.out.println(first.name + " will attack first.");
    }

    public void start() {
        System.out.println("Combat begins between " + f1.name + " and " + f2.name + ".");
        int round = 1;

        while (f1.health > 0 && f2.health > 0) {
            System.out.println("\n======== Round " + round + " ========");

            // İlk saldırıyı belirlenen dövüşçü yapacak
            second.health = first.hit(second);

            // Eğer ikinci dövüşçü hayattaysa o da karşı saldırı yapacak
            if (second.health > 0) {
                first.health = second.hit(first);
            }

            printScore();  // Her round sonunda sağlık durumunu yazdıralım
            if (isWin()) {
                break;
            }

            round++;
        }

        //displayWinner();
    }

    // Beraberlik kontrolü de ekledik
    public boolean isWin() {
        if (f1.health == 0 && f2.health == 0) {
            System.out.println("Berabere! İki dövüşçü de aynı anda düştü.");
            return true;
        }
        if (f1.health == 0) {
            System.out.println("Maçı Kazanan: " + f2.name);
            return true;
        } else if (f2.health == 0) {
            System.out.println("Maçı Kazanan: " + f1.name);
            return true;
        }
        return false;
    }


    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
    }

    //private void displayWinner() {
    //    if (f1.health > 0 && f2.health <= 0) {
    //        System.out.println(f1.name + " kazandı!");
    //    } else if (f1.health <= 0 && f2.health > 0) {
    //        System.out.println(f2.name + " kazandı!");
    //    } else {
    //        System.out.println("İki dövüşçü de düştü, berabere!");
    //    }
    //}
}

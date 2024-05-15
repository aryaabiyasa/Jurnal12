import java.util.PriorityQueue;

public class Jadwal {
    private PriorityQueue<Tugas> tugas;

    public Jadwal() {
        tugas = new PriorityQueue<Tugas>();
    }

    public void tambahTugas(Tugas tugasBaru) {
        this.tugas.add(tugasBaru);
    }

    public void tampilkanJadwalPrioritas() {
        Tugas prioritas = tugas.peek();

        if (prioritas == null) {
            System.out.println("Tidak ada tugas");
            return;
        }

        System.out.printf("Task terdekat yang harus diselesaikan: %s", prioritas.getDescription());
    }

    public void selesaikanTugas() {
        Tugas prioritas = tugas.peek();

        if (prioritas == null) {
            System.out.println("Tidak ada tugas");
            return;
        }

        System.out.printf("%s selesai dilaksanakan, ", prioritas.getDescription());

        if (tugas.isEmpty()) {
            System.out.println("Tidak ada tugas lagi");
        } else {
        System.out.printf("berikutnya tugas %s", tugas.peek().getDescription());
        }
    }
}
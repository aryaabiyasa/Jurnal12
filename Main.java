public class Main {
    public static void main(String[] args) {
        Jadwal jadwal = new Jadwal();

        jadwal.tambahTugas(new Tugas(5, "tugas ISD"));
        jadwal.tambahTugas(new Tugas(8, "rapat UKM"));
        jadwal.tambahTugas(new Tugas(3, "Kuis SBD"));

        jadwal.tampilkanJadwalPrioritas();

        System.out.println();

        jadwal.selesaikanTugas();
    }
}
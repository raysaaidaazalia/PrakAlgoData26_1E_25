package Minggu5;

public class mahasiswa25 {
    mahasiswa25 mhs25[] = new mahasiswa25[8];

    double totalBF25(int[] uas25) {
        double rata25 = 0;
        for (int i = 0; i < uas25.length; i++) {
            rata25 = rata25 + uas25[i];
        }
        return (double)rata25/uas25.length;
    }

    int totalDCrendah25(int[] uts25, int l25, int r25) {
        if (l25 == r25) {
            return uts25[l25];
        }
        int mid25 = (l25 + r25) / 2;

        int lsum25 = totalDCrendah25(uts25, l25, mid25);
        int rsum25 = totalDCrendah25(uts25, mid25 + 1, r25);

        if (rsum25 < lsum25) {
            return rsum25;
        } else {
            return lsum25;
        }
    }

    int totalDCtinggi25(int[] uts25, int l25, int r25) {
        if (l25 == r25) {
            return uts25[l25];
        }
        int mid25 = (l25 + r25) / 2;

        int lsum25 = totalDCtinggi25(uts25, l25, mid25);
        int rsum25 = totalDCtinggi25(uts25, mid25 + 1, r25);

        if (rsum25 > lsum25) {
            return rsum25;
        } else {
            return lsum25;
        }
    }
}

package Minggu5;

public class faktorial25 {
    int faktorialBF25(int n){
        int fakto25=1;
        int i=1;
       while (i <= n) {
        fakto25 = fakto25 * i;
        i++;
       }
        return fakto25;
    }
int faktorialDC25(int n) {
    if (n == 1) {
        return 1;
    }else{
        int fakto25 = n* faktorialDC25 (n-1);
        return fakto25;
    }
}
}

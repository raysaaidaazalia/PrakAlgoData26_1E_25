package Minggu5;

public class sum25 {
    double keuntungan25[];

    sum25(int el25){
        keuntungan25 = new double[el25];
    }
    double totalBF25(){
       double total25=0;
       for (int i = 0; i < keuntungan25.length; i++) {
        total25 = total25 + keuntungan25[i];
       }
       return total25;
    }
    double totalDC25(double arr[] ,int l25 , int r25){
        if (l25 == r25) {
            return arr[l25];
        }
        int mid25 = (l25 + r25)/2;
        double lsum25 = totalDC25(arr,l25,mid25);
        double rsum25 = totalDC25(arr,mid25+1 ,r25);
        return lsum25+rsum25;
    }
}

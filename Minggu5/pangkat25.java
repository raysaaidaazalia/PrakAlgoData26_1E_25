package Minggu5;

public class pangkat25 {
    int nilai25,pangkat;

    pangkat25(int n25,int p25){
        nilai25 = n25;
        pangkat = p25;
    }
    int pangkatBF(int a25,int n25){
        int hasil25 = 1;
        for (int i = 0; i <n25; i++) {
            hasil25 = hasil25 *a25;
        }
        return hasil25;
    }
    int pangkatDC(int a25,int n25){
        if (n25 == 1) {
            return a25;
        }else{
            if (n25%2==1) {
                return (pangkatDC(a25 , n25/2)*pangkatDC(a25 , n25/2)*a25);
            }else{
                return (pangkatDC(a25 , n25/2)*pangkatDC(a25 , n25/2));
            }
        }
    }
}

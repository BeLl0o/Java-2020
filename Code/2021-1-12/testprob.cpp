#include <stdio.h>
int main (void){
    int a[3][3]={{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    for(int i = 0; i<= 2; i++){
        for(int j = i+1; j <= 2; j++){
            int m = a[i][j];
            a[i][j] = a[j][i];
            a[j][i] = m;
        }
    }
    // outputk
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) printf("%d ", a[i][j]);
        putchar('\n');
    }
    return 0;
}
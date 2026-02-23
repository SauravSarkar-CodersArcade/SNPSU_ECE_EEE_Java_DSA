#include<stdio.h>
#include<stdbool.h>
enum Boolean {
    FALSE, TRUE, A=100, B, C
};
int main(){
    printf("SNPSU_ECE_EEE\n");
    bool status = true;
    printf("%i\n", status);
    enum Boolean v = C;
    printf("%d\n", v);
    printf("Size of enum: %d bytes\n", sizeof(v));
    printf("Size of enum: %llu bytes\n", sizeof(v));
    printf("Size of enum: %zu bytes\n", sizeof(v));
    int arr[] = {1,2,3};
    printf("%d\n", arr[0]);

    (2 > 3) ? printf("T") : printf("F");
    return 0;
}
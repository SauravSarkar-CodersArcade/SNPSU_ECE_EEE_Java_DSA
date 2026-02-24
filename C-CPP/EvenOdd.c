#include<stdio.h>
void add(int a, int b){
        printf("%d\n", a+b);
    }
int main(){
        add(1,2);
        printf("Enter any number:\n");
        int n;
        scanf("%d", &n);
        if(n & 1){
            printf("%d is ODD", n);
        }else {
            printf("%d is EVEN", n);
        }
    return 0;
}
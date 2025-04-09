#include <stdio.h>
int main(){
    int v1 =0, v2 = 35, v3=29;
    if(v1 > v2 ? v2 : v1){//삼항연산자 거짓이므로 v1값인 0이 선택
        v2 = v2 << 2;//비트 시프트 연산자 
    }else{
        v3 = v3 << 2;//v3는 29 왼쪽으로 2비트 시프트되어 116이 됩니다
    }
    printf("%d", v2 + v3);//35 +116 = 151
    return 0;//반납
}
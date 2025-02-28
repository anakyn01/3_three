#include <stdio.h>

int main(){
    int myage = 100;
    int* ptr = &myage;

    printf("%d/n", myage);//100
    //메모리 주소
    printf("%p\n", &myage);
    //포인터 ptr
    printf("%p\n", ptr);
    printf("%d\n", *ptr);

    int set[] = {25, 50, 75, 100};
    int i;

    for(i =0; i<4; i++){
        printf("%p\n", &set[i]);
    }

    //Dereference 역참조 메모리주소전에 실제 화면에서 보이는 값
    /*int nums = 50;
    int* ptr = &nums;

    printf("%p\n", ptr);
    printf("%d\n" ,*ptr);*/

    return 0;
}

/*
포인터 다른 변수의 메모리 주소를 자신의 값으로 저장하는 변수
포인터변수는 같은 유형의 데이터 유형을 가리키며 연산자와 생성된다
작업중인 변수의 주소가 포인터 할당됩니다
 */
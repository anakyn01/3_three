#include <stdio.h>
#include <string.h>//문자열 함수를 사용하려면 헤더파일에 포함

int main(){

char alphabet[] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//strlen() => 문자열의 길이
printf("%d/n", strlen(alphabet));
//sizeof() => 실제문자열의 길이가 아닌 메모리크기(바이트)를 리턴
char bt[100] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
printf("%d/n", sizeof(bt));
    return 0;
//strcat() => 문자열 연결(결합)
char

}
/*
strlen() => 문자열의 길이
sizeof() => 실제문자열의 길이가 아닌 메모리크기(바이트)를 리턴
strcat() => 문자열 연결(결합)
strcpy() => 문자열 복사
strcmp() => 문자열 비교
 */
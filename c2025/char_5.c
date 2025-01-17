/*
c문자열
c는 다른 프로그래밍 언어와 다르게 String이 없다
대신 char로 문자배열을 만든다
""를 사용
*/
#include <stdio.h>
int main(){
char greeting[] = "hello world";
//이렇게 사용하면 printf()함수를 형식지정자 %s로 문자열로 작업하고 있다는 것을 알립니다
printf("%c", greeting[0] );

// '\0' => 널 종료 문자 문자열의 끝임을 알려준다
char new[] = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!', '\0'};
char newN[] = "hello World";

printf("%s\n", new);
printf("%s\n", newN);

//예를 들어 "" 문자열을 쓸때 " "" "
char txt[] ="We are the \"viking\" from the north.";
printf("%s\n", txt);
printf("%c\n", txt[2]);

//\n 새줄, \t tab, \0 

 return 0;//end
}
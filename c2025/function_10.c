/*
재귀함수 : 호출 자체를 만드는 기술
복잡한 문제를 해결하기 쉬운 간단한 문제로 분해
아래에서 재귀는 숫자범위를 더하는데 사용됩니다
*/
#include <stdio.h>

int sum(int k);//key number

int main(){//값을 출력
    int result = sum(11);
    printf("%d", result);
    return 0;
}

int sum(int k){
    if(k > 0){
        return k + sum(k-1);//10+9+8+7+6+5+4+3+2+1
    }else{
        return 0;//0일때 종료
    }
}

//자바스크립트에서 강조하는 흐름이 있는데 비동기적프로그래밍 언어인데
//여러개의 콜백함수가 중첩되면 코드가 깊어지고 복잡하게 얽히는 현상이 발생한다//
//콜백함수 지옥 코드가 점점 복잡해지고 가독성이 떨어집니다..
/*
call(function(rs1)){
    call(function(rs2)){
        call(function(rs3)){
        }
    }
}
 */
#include <stdio.h>
int main(){
//배열은 단일변수에 여러값을 저장할때 사용
int myNumber[] = {25, 50, 75, 100};
printf("%d", myNumber[0]);
//배열을 변경할때 
myNumber[0] = 33;
printf("%d", myNumber[0]);
 
//다차원 배열 2차원 배열은 행과 열로 구성된 표 행렬로 불립니다
int matrix[2][3] = {{1,4,2},{3,6,8}}; //[0][1]
printf("%d\n", matrix[0][2]);

//다차원 배열을 통한 루프
int mat[2][3] = {{1,4,2},{3,6,8}};
int i, j;
for(i=0; i < 2; i++){
    for(j=0; j<3; j++){
        printf("%d\n", mat[i][j]);
    }
}

 return 0;//end
}
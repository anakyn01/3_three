package stream;

public class Resource_4 {

	public static void main(String[] args) {


	}

}
/*리소스로 부터 스트림 얻기
stream[List, set] 패키지에는 스트림 인터페이스들이 있다
BaseStream인터페이스를부모로 한 자식 인터페이스들은 아래와 같은 상속관계를 이루고 있다
BaseStream
Stream, intStream[int 범위], LongStream[long 범위], DoubleStream[랜덤수]

1) Stream<T> {리턴타입}
- 메소드(매개변수) 
java.util.Collection.stream(List 컬렉션)
java.util.Collection.parallelStream(Set 컬렉션)

2) 리턴타입이 배열일 경우
Stream<T> 
- 메소드(매개변수) 
Arrays.stream(T[]), Stream.of(T[])

intStream
- 메소드(매개변수) 
Arrays.stream(int[]), IntStream.of(T[])

LongStream
- 메소드(매개변수) 
Arrays.stream(long[]), LongStream.of(long[])

DoubleStream
- 메소드(매개변수) 
Arrays.stream(double[]), DoubleStream.of(double[])

3) 리턴타입이 숫자일 경우

IntStream
- 메소드(매개변수) 
IntStream.range(int, int), IntStream.rangeClosed(int, int)

LongStream
- 메소드(매개변수) 
LongStream.range(long, long), LongStream.rangeClosed(long, long)

4) 그외
Stream<Path>
- 메소드(매개변수) Files.list(Path) => 디렉토리

Stream<String>
- 메소드(매개변수) Files.lines(Path.Charset) => 텍스트 파일

랜덤 수
DoubleStream Random.doubles(...)
IntStream Random.ints()
LongStream Random.longs()


*/

package stream;

public class Resource_4 {

	public static void main(String[] args) {


	}

}
/*���ҽ��� ���� ��Ʈ�� ���
stream[List, set] ��Ű������ ��Ʈ�� �������̽����� �ִ�
BaseStream�������̽����θ�� �� �ڽ� �������̽����� �Ʒ��� ���� ��Ӱ��踦 �̷�� �ִ�
BaseStream
Stream, intStream[int ����], LongStream[long ����], DoubleStream[������]

1) Stream<T> {����Ÿ��}
- �޼ҵ�(�Ű�����) 
java.util.Collection.stream(List �÷���)
java.util.Collection.parallelStream(Set �÷���)

2) ����Ÿ���� �迭�� ���
Stream<T> 
- �޼ҵ�(�Ű�����) 
Arrays.stream(T[]), Stream.of(T[])

intStream
- �޼ҵ�(�Ű�����) 
Arrays.stream(int[]), IntStream.of(T[])

LongStream
- �޼ҵ�(�Ű�����) 
Arrays.stream(long[]), LongStream.of(long[])

DoubleStream
- �޼ҵ�(�Ű�����) 
Arrays.stream(double[]), DoubleStream.of(double[])

3) ����Ÿ���� ������ ���

IntStream
- �޼ҵ�(�Ű�����) 
IntStream.range(int, int), IntStream.rangeClosed(int, int)

LongStream
- �޼ҵ�(�Ű�����) 
LongStream.range(long, long), LongStream.rangeClosed(long, long)

4) �׿�
Stream<Path>
- �޼ҵ�(�Ű�����) Files.list(Path) => ���丮

Stream<String>
- �޼ҵ�(�Ű�����) Files.lines(Path.Charset) => �ؽ�Ʈ ����

���� ��
DoubleStream Random.doubles(...)
IntStream Random.ints()
LongStream Random.longs()


*/

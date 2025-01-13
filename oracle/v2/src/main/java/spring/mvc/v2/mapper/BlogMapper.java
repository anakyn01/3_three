package spring.mvc.v2.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import spring.mvc.v2.vo.V2ListRequestVO;
import spring.mvc.v2.vo.V2ListResponseVO;

@Mapper
public interface BlogMapper {

	int delete(int blgContSeq);//삭제
	List<V2ListResponseVO>selectList(V2ListRequestVO v2ListRequestVO);//리스트
}

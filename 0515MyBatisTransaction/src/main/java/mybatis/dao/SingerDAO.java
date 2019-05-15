package mybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mybatis.domain.Singer;

@Repository
public class SingerDAO {
	@Autowired
	private SqlSession sqlSession;
	
	//Singer 테이블의 몯느 데이터를 가져오는 메소드
	public List<Singer> singerList() {
		return sqlSession.selectList("singer.singerList");
	}
	//Singer 테이블의 몯느 데이터를 가져오는 메소드
	public int singerInsert(Singer singer) {
		return sqlSession.insert("singer.singerinsert",singer);
	}
}

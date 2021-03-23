package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import model.Board;

public class BoardDAO {

	private SqlSessionFactory sqlSessionFactory = null;

	public BoardDAO(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;

	}

	public List<Board> selectAll() {

		List<Board> list = null;
		SqlSession session = sqlSessionFactory.openSession();

		try {
			list = session.selectList("Board.selectAll");
		} finally {
			session.close();
		}
		return list;
	}

	public Board selectById(int board_id) {

		Board board = null;
		SqlSession session = sqlSessionFactory.openSession();

		try {
			board = session.selectOne("Board.selectById", board_id);
		} finally {
			session.close();
		}
		return board;

	}

	public int insert(Board board) {
		int board_id = -1;
		SqlSession session = sqlSessionFactory.openSession();

		try {
			board_id = session.insert("Board.insert", board);
		} finally {
			session.commit();
			session.close();
		}
		return board_id;
	}

	public void update(Board board) {

		SqlSession session = sqlSessionFactory.openSession();

		try {
			session.update("Board.update", board);
		} finally {
			session.commit();
			session.close();
		}

	}

	public void delete(int board_id) {

		SqlSession session = sqlSessionFactory.openSession();

		try {
			session.delete("Board.delete", board_id);
		} finally {
			session.commit();
			session.close();
		}
	}

}






























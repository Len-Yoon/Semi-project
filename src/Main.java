import java.util.List;

import dao.BoardDAO;
import model.Board;
import mybatis.MyBatisConnectionFactory;

public class Main {

	public static void main(String[] args) {

		// Insert
		BoardDAO boardDAO = new BoardDAO(MyBatisConnectionFactory.getSqlSessionFactory());
		Board board = new Board();

		System.out.println("==INSERT==");

		board.setWriter("고길동");
		board.setTitle("임시 제목1");
		board.setContent("임시 내용1");

		board.setWriter("둘리");
		board.setTitle("임시 제목2");
		board.setContent("임시 내용2");

		// Read
		System.out.println("==READ==");
		
		List<Board> boardList = boardDAO.selectAll();
		for (Board boardInfo : boardList) {
			System.out.println("Board Id: " + boardInfo.getBoard_id());
			System.out.println("Board Writer: " + boardInfo.getWriter());
			System.out.println("Board Title: " + boardInfo.getTitle());
			System.out.println("Board Contet: " + boardInfo.getContent());
			System.out.println("Board rdate: " + boardInfo.getRdate());
			System.out.println("Board Hit: " + boardInfo.getHit());

		}

		// upload
		System.out.println("==UPLOAD==");

		board.setBoard_id(4);
		board.setWriter("마이콜");
		boardDAO.update(board);

		// read
		
		System.out.println("==READ==");
		board = boardDAO.selectById(4);
		System.out.println("Board Id: " + board.getBoard_id());

		// Delete
		System.out.println("==DELETE==");

		boardDAO.delete(4);

		// Read
		
		System.out.println("==READ==");
		boardList.clear();
		boardList = boardDAO.selectAll();
		for (Board boardInfo : boardList) {
			System.out.println("Board Id: " + boardInfo.getBoard_id());
			System.out.println("Board Writer: " + boardInfo.getWriter());
			System.out.println("Board Title: " + boardInfo.getTitle());
			System.out.println("Board Contet: " + boardInfo.getContent());
			System.out.println("Board rdate: " + boardInfo.getRdate());
			System.out.println("Board Hit: " + boardInfo.getHit());

		}

	}

}

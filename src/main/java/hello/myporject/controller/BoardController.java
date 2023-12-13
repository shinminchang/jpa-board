package hello.myporject.controller;

import hello.myporject.domain.Board;
import hello.myporject.repository.BoardRepository;
import org.springframework.ui.Model;

public class BoardController {
    private final BoardRepository boardRepository;

    public String boardForm(Model model) {
        List<Board> boards = boardRepository.findAll();
        model.addAttribute("boards", boards);

        return "basic/boards";
    }
}

package com.example.demo.controller;

import com.example.demo.dto.BoardDTO;
import com.example.demo.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/save")
    public String saveForm() {
        return "save";
    }

    @PostMapping("/save")
    public String save(BoardDTO BoardDTO) {
        System.out.println(BoardDTO);
        boardService.save(BoardDTO);
        return "redirect:/board/";
    }

    @GetMapping("/")
    public String findAll(Model model) {
        List<BoardDTO> BoardDTOList = boardService.findAll();
        model.addAttribute("boardList", BoardDTOList);
        return "list";
    }

    @GetMapping("/{id}")
    public String findById(@PathVariable Long id, Model model) {
        boardService.updateHits(id);
        BoardDTO BoardDTO = boardService.findById(id);
        model.addAttribute("board", BoardDTO);
        return "detail";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        boardService.delete(id);
        return "redirect:/board/";
    }

    @GetMapping("/update/{id}")
    public String updateForm(@PathVariable Long id, Model model) {
        BoardDTO BoardDTO = boardService.findById(id);
        model.addAttribute("board", BoardDTO);
        return "update";
    }

    @PostMapping("/update")
    public String update(BoardDTO BoardDTO, RedirectAttributes redirectAttributes) {
        try {
            boardService.update(BoardDTO);
            return "redirect:/board/" + BoardDTO.getId();
        } catch (IllegalArgumentException e) {
            redirectAttributes.addFlashAttribute("errorMessage", e.getMessage());
            return "redirect:/board/update/" + BoardDTO.getId();
        }
    }
}
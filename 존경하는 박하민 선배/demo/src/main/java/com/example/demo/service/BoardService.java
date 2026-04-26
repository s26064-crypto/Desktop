package com.example.demo.service;

import com.example.demo.dto.BoardDTO;
import com.example.demo.entity.BoardEntity;
import com.example.demo.repository.BoardRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    public void save(BoardDTO boarddto) {
        BoardEntity boardEntity = BoardEntity.toSaveEntity(boarddto);
        boardRepository.save(boardEntity);
    }

    public List<BoardDTO> findAll() {
        List<BoardEntity> boardEntityList = boardRepository.findAll();
        List<BoardDTO> boardDTOList = new ArrayList<>();

        for (BoardEntity boardEntity : boardEntityList) {
            boardDTOList.add(BoardDTO.toBoardDTO(boardEntity));
        }

        return boardDTOList;
    }

    @Transactional
    public void updateHits(Long id){
        boardRepository.updateHits(id);
    }

    // 상세 조회
    public BoardDTO findById(Long id){
        Optional<BoardEntity> optionalBoardEntity = boardRepository.findById(id);

        if(optionalBoardEntity.isPresent()) {
            BoardEntity boardEntity = optionalBoardEntity.get();
            return BoardDTO.toBoardDTO(boardEntity);
        } else {
            return null;
        }
    }

    // 삭제
    public void delete(Long id){
        boardRepository.deleteById(id);
    }

    // 수정
    @Transactional
    public void update(BoardDTO boardDTO){
        BoardEntity boardEntity = boardRepository.findById(boardDTO.getId()).orElseThrow(() ->
                new IllegalArgumentException("해당 게시글을 찾을 수 없습니다"));

        if(boardEntity.getBoardPass().equals(boardDTO.getBoardPass())){
            boardEntity.update(boardDTO);
        } else {
            throw new IllegalArgumentException("비밀번호 불일치");
        }
    }
}
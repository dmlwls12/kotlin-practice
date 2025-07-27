package com.uijin.board.service

import com.uijin.board.domain.Board
import com.uijin.board.repository.BoardRepository
import org.springframework.stereotype.Service

@Service
class BoardService (private val boardRepository: BoardRepository) {

    fun findAll(): List<Board> = boardRepository.findAll()

    fun findById(id: Long) : Board = boardRepository.findById(id)
        .orElseThrow() {IllegalStateException("해당 게시글이 없습니다. id=$id")}

    fun save(title: String, content: String): Board {
        return boardRepository.save(Board(title=title, content=content))
    }

    fun delete(id: Long) = boardRepository.deleteById(id)
}
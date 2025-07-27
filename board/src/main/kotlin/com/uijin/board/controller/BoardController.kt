package com.uijin.board.controller

import com.uijin.board.service.BoardService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class BoardController(private val boardService: BoardService) {

    @GetMapping("/posts")
    fun list(model: Model): String{
        val posts = boardService.findAll()
        model.addAttribute("posts", posts)
        return "posts/list"
    }

    @GetMapping("/posts/{id}")
    fun detail(@PathVariable id: Long, model: Model): String{
        val post = boardService.findById(id)
        model.addAttribute("post", post)
        return "posts/detail"
    }

    @GetMapping("/posts/new")
    fun writeForm(): String = "posts/write"

    @PostMapping("/posts")
    fun create(
        @RequestParam title: String,
        @RequestParam content: String
    ): String {
        boardService.save(title, content)
        return "redirect:/posts"
    }

    @PostMapping("/posts/delete/{id}")
    fun delete(@PathVariable id:Long): String{
        boardService.delete(id)
        return "redirect:/posts"
    }
}
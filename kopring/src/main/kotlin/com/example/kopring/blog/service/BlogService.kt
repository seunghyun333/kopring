package com.example.kopring.blog.service

import com.example.kopring.blog.dto.BlogDto
import org.springframework.stereotype.Service

@Service
class BlogService {
    fun searchKakao(blogDto: BlogDto): String?{
        println(blogDto.toString())
        return "SearchKakao"
    }
}
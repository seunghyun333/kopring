package com.example.kopring.blog.repository

import com.example.kopring.blog.entity.Wordcount
import org.springframework.data.repository.CrudRepository

//WordCount 라는 엔티티 전달, key값은 String
interface WordRepository : CrudRepository<Wordcount, String> {
    fun findTop100ByOrderByCntDesc(): List<Wordcount>
}

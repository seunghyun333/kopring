package com.example.kopring.blog.repository

import com.example.kopring.blog.entity.Wordcount
import org.springframework.data.repository.CrudRepository

interface WordRepository : CrudRepository<Wordcount, String>
//WordCount 라는 엔티티 전달, key값은 String
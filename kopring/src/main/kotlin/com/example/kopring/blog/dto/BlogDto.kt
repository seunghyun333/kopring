package com.example.kopring.blog.dto

import com.example.kopring.core.annotation.ValidEnum
import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

data class BlogDto (

    @field:NotBlank(message = "query parameter required")
    @JsonProperty("query")
    private val _query: String?,

    @field:NotBlank(message = "sort parameter required")
    @field:ValidEnum(enumClass = EnumsSort::class, message = "sort parameter one of ACCURACY nd RECENCY")
    val sort: String?,

    @field:NotNull(message = "page parameter required")
    @field:Max(50, message = "page is more than max")
    @field:Min(1, message = "page is less than min")
    val page: Int?,

    @field:NotNull(message = "size parameger required")
    val size: Int?
) {

    val query: String
        get() = _query!!
    private enum class EnumsSort {
        ACCURACY,
        RECENCY
    }
}

package ru.netology.nmedia.db

import ru.netology.nmedia.dto.Post

interface PostDao {
    fun getAll(): List<Post>
    fun save(post: Post): Post?
    fun lickeById(id: Long)
    fun removeById(id: Long)
}
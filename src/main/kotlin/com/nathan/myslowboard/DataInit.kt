package com.nathan.myslowboard

import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component
import java.time.LocalDateTime

@Component
class DataInit(private val postRepository: PostRepository) : CommandLineRunner {

    override fun run(vararg args: String?) {
        println("************* 대량 데이터 저장 시작 ************* ")

        val postList = mutableListOf<Post>()

        // 십만개 게시글을 생성
        for ( i in 1..100000){
            val post = Post(
                postId = 0,
                title = "title $i",
                content = "content $i",
                boardId = 1L,
                writerId = 123L,
                createdAt = LocalDateTime.now(),
                updatedAt = LocalDateTime.now()
            )

            postList.add(post)
        }

        // 저장
        if(postList.size == 5000){
            postRepository.saveAll(postList)
            postList.clear()
        }

        println("************* 대량 데이터 저장 종료 ************* ")
    }
}
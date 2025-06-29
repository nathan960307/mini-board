package com.nathan.myslowboard

import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service

@Service
class PostService(
    private val postRepository: PostRepository,
) {

    // 게시판 단위의, 페이지 단위로 게시글을 조회할 수 있음
    fun getPostsByBoard(
        boardId: Long,
        page: Int,
        size: Int
    ): List<Post> {
        val pageable = PageRequest.of(
            /* pageNumber = */ page,
            /* pageSize = */ size,
            /* sort = */ Sort.by(Sort.Direction.DESC, "createdAt")
        )

        return postRepository.findByBoardId(boardId, pageable).content
    }
}
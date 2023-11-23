package com.example.springbootswagger.member

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MemberController {

    @GetMapping("/members")
    fun listup(): String {
        return "회원 목록 페이지"
    }
}
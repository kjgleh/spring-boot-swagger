package com.example.springbootswagger.member

import com.example.springbootswagger.common.Constant.BEARER_AUTH
import io.swagger.v3.oas.annotations.security.SecurityRequirement
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MemberController {

    @SecurityRequirement(name = BEARER_AUTH)
    @GetMapping("/members")
    fun listup(): String {
        return "회원 목록 페이지"
    }
}
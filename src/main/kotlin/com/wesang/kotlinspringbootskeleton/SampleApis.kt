package com.wesang.kotlinspringbootskeleton

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/sample")
class SampleApis {

    @GetMapping("/test")
    fun getSampleTest(): String {
        return "hello sample kotlin!"
    }

}

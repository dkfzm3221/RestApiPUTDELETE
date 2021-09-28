package com.example.put.delete;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DeleteApiController {

    @DeleteMapping("/delete/{userId}")//외않되?
    public void delete(@PathVariable String userId, @RequestParam String account){

        System.out.println(userId);
        System.out.println(account);

        //delete -> 리소스 삭제 200 ok
    }
}


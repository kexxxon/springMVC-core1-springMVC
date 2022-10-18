package hello.springmvc.requestmapping;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping/users")
public class MappingClassController {
    /* 회원 등록: POST /mapping/users */
    @PostMapping
    public String addUser() {

        return "post user";
    }

    /* 회원 수정: PATCH */
    @PatchMapping("/{userId}")
    public String updateUser(@PathVariable String userId) {

        return "update userId = " + userId;
    }

    /* 특정 회원 조회: GET */
    @GetMapping("/{userId}")
    public String findUser(@PathVariable String userId) {

        return "get userId = " + userId;
    }

    /* 전체 회원 조회: GET */
    @GetMapping
    public String users() {

        return "get users";
    }

    /* 회원 삭제: DELETE */
    @DeleteMapping("/{userId}")
    public String deleteeUser(@PathVariable String userId) {

        return "delete userId = " + userId;
    }
}

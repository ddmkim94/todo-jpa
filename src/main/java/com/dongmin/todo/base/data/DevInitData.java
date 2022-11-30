package com.dongmin.todo.base.data;

import com.dongmin.todo.member.entity.Member;
import com.dongmin.todo.member.entity.MemberRole;
import com.dongmin.todo.member.service.MemberService;
import com.dongmin.todo.todo.entity.Todo;
import com.dongmin.todo.todo.entity.TodoType;
import com.dongmin.todo.todo.service.TodoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.LocalDateTime;

@Configuration
@Profile("dev")
public class DevInitData {

    @Bean
    public CommandLineRunner initData(MemberService memberService, TodoService todoService) {
        return args -> {
            Member member1 = memberService.join(Member.builder()
                    .email("user1@naver.com")
                    .password("1234")
                    .username("박은빈")
                    .profile("default.png")
                    .role(MemberRole.USER)
                    .build());

            Member member2 = memberService.join(Member.builder()
                    .email("admin@naver.com")
                    .password("1234")
                    .username("진양철")
                    .profile("default.png")
                    .role(MemberRole.ADMIN)
                    .build());

            todoService.write(Todo.builder()
                    .title("초기 데이터 생성하기")
                    .content("CommandLineRunner 사용해서 생성")
                    .type(TodoType.TODO)
                    .startDate(LocalDateTime.now())
                    .endDate(LocalDateTime.of(2022, 12, 10, 0, 0))
                    .member(member1)
                    .build());

            todoService.write(Todo.builder()
                    .title("회원 목록 갱신")
                    .content("불건전한 회원 탈퇴 처리시키기")
                    .type(TodoType.DOING)
                    .startDate(LocalDateTime.now())
                    .endDate(LocalDateTime.of(2022, 12, 1, 0, 0))
                    .member(member2)
                    .build());
        };
    }
}

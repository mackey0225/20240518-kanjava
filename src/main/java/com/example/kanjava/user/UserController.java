package com.example.kanjava.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UserController {

  private final UserRepository userRepository;

  @GetMapping(value = "/new")
  public String newUser() {
    return "new";
  }

  @PostMapping(value = "/save")
  public String saveUser(@ModelAttribute UserForm userForm) {
    System.out.println(userForm);

    // HACK: userForm のバリデーションしたいなー

    // DB への挿入
    User savedUser = userRepository.save(User.from(userForm));
    System.out.println(savedUser);

    // 突っ込めたら、完了画面
    return "redirect:complete";
  }

  @GetMapping(value = "/complete")
  public String completeSaveUser() {
    return "complete";
  }
}

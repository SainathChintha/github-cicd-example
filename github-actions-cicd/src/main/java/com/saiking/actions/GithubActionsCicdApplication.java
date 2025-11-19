package com.saiking.actions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GithubActionsCicdApplication {


	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome to Github Actions CI/CD";
	}

/*	echo "# github-cicd-example" >> README.md
	git init
	git add README.md
	git commit -m "first commit"
	git branch -M main
	git remote add origin https://github.com/SainathChintha/github-cicd-example.git
	git push -u origin main*/

	public static void main(String[] args) {
		SpringApplication.run(GithubActionsCicdApplication.class, args);
	}

}

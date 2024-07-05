package pl.mpss.gitapitask.dto;

import java.time.LocalDate;

public class GitHubUserDTO {
    private String id;
    private String login;
    private String name;
    private String type;
    private String avatarUrl;
    private LocalDate createdAt;
    private int followers;
    private int public_repos;
}

package org.example.musictest;

import jakarta.servlet.http.HttpSession;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Controller
public class MusicController {
    private final HttpSession session;

    @GetMapping("/playlist")
    public String getPlaylist(Model model) {
        // 플레이리스트에 노래 추가
        List<Song> songs = new ArrayList<>();
        songs.add(new Song("아모르파티", "/music/amor.mp3", "/cover/amor-cover.jpg"));
        songs.add(new Song("나팔바지", "/music/pants.mp3", "/cover/pants-cover.png"));

        model.addAttribute("songs", songs);
        return "player";
    }
}

@Getter
@Setter
class Song {
    private String title;
    private String songSrc;
    private String coverSrc;

    public Song(String title, String songSrc, String coverSrc) {
        this.title = title;
        this.songSrc = songSrc;
        this.coverSrc = coverSrc;
    }
}

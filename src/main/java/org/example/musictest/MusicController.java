package org.example.musictest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MusicController {

    @GetMapping("/play")
    public String playMusic(Model model) {
        model.addAttribute("song", "/music/song.mp3");
        return "play";
    }
}

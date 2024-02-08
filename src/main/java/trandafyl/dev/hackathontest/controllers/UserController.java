package trandafyl.dev.hackathontest.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trandafyl.dev.hackathontest.dto.UserPartialResponse;
import trandafyl.dev.hackathontest.models.User;
import trandafyl.dev.hackathontest.services.UserService;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("auction-lots/{lotId}/bidders/")
    public ResponseEntity<List<UserPartialResponse>> getBidders(@PathVariable long lotId){
        var bidders = userService.getBidders(lotId);

        return ResponseEntity.ok(bidders);
    }
}

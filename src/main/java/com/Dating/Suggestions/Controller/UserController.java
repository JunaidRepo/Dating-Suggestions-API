package com.Dating.Suggestions.Controller;
import com.Dating.Suggestions.EntityDto.UsersDto;
import com.Dating.Suggestions.Response.Message;
import com.Dating.Suggestions.Response.ResponseEnty;
import com.Dating.Suggestions.Service.Userservice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.List;

@RestController

@CrossOrigin("http://localhost:5173")
public class UserController {
    public final Userservice Userser;

    public UserController(Userservice Userser){
        this.Userser=Userser;
    }

    @PostMapping("/add")
    public ResponseEntity<ResponseEnty<String>> add(@RequestBody UsersDto dto){
        Userser.add(dto);
        return new ResponseEntity<>(new ResponseEnty<>(200, Message.SUCCESS_INSERT,null, LocalDateTime.now()),HttpStatus.ACCEPTED);
    }

    @PostMapping("/addAll")
    public ResponseEntity<ResponseEnty<String>> addAll(@RequestBody List<UsersDto> dto){
        dto.stream().forEach(i->Userser.add(i));
        return new ResponseEntity<>(new ResponseEnty<>(200, Message.SUCCESS_INSERT,null, LocalDateTime.now()),HttpStatus.ACCEPTED);
    }


    @PutMapping("/update")
    public ResponseEntity<ResponseEnty<String>> update(@RequestBody UsersDto dto) {
        Userser.update(dto);
        return new ResponseEntity<>(new ResponseEnty<>(200,Message.SUCCESS_UPDATE,null, LocalDateTime.now()),HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseEnty<String>> delete(@PathVariable Integer id) {
        Userser.remove(id);
        return new ResponseEntity<>(new ResponseEnty<>(200,Message.SUCCESS_DELETE,null, LocalDateTime.now()),HttpStatus.ACCEPTED);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<ResponseEnty<UsersDto>> get(@PathVariable Integer id) {
        UsersDto dto=Userser.get(id);
        return new ResponseEntity<>(new ResponseEnty<>(200,Message.SUCCESS_FETCH,dto, LocalDateTime.now()),HttpStatus.ACCEPTED);
    }

    @GetMapping("/getAll")
    public ResponseEntity<ResponseEnty<List<UsersDto>>> getall() {
        List<UsersDto> dto=Userser.all();
        return new ResponseEntity<>(new ResponseEnty<>(200,Message.SUCCESS_FETCH,dto, LocalDateTime.now()),HttpStatus.ACCEPTED);
    }

    @GetMapping("/match/{id}")
    public ResponseEntity<ResponseEnty<List<UsersDto>>> findMatch(@PathVariable Integer id) {
        List<UsersDto> dto=Userser.match(id);
        return new ResponseEntity<>(new ResponseEnty<>(200,Message.SUCCESS_FETCH,dto, LocalDateTime.now()),HttpStatus.ACCEPTED);
    }
}

package com.Dating.Suggestions.Controller;
import com.Dating.Suggestions.EntityDto.Intrest_DetailsDto;
import com.Dating.Suggestions.Response.Message;
import com.Dating.Suggestions.Response.ResponseEnty;
import com.Dating.Suggestions.Service.Intrest_Detailservice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.List;

@RestController

@CrossOrigin("http://localhost:5173")
public class UserController {
    public final Intrest_Detailservice Intrest_Detailser;

    public UserController(Intrest_Detailservice Intrest_Detailser){
        this.Intrest_Detailser=Intrest_Detailser;
    }

    @PostMapping("/add")
    public ResponseEntity<ResponseEnty<String>> add(@RequestBody Intrest_DetailsDto dto){
        Intrest_Detailser.add(dto);
        return new ResponseEntity<>(new ResponseEnty<>(200, Message.SUCCESS_INSERT,null, LocalDateTime.now()),HttpStatus.ACCEPTED);
    }

    @PostMapping("/addAll")
    public ResponseEntity<ResponseEnty<String>> addAll(@RequestBody List<Intrest_DetailsDto> dto){
        dto.stream().forEach(i->Intrest_Detailser.add(i));
        return new ResponseEntity<>(new ResponseEnty<>(200, Message.SUCCESS_INSERT,null, LocalDateTime.now()),HttpStatus.ACCEPTED);
    }


    @PutMapping("/update")
    public ResponseEntity<ResponseEnty<String>> update(@RequestBody Intrest_DetailsDto dto) {
        Intrest_Detailser.update(dto);
        return new ResponseEntity<>(new ResponseEnty<>(200,Message.SUCCESS_UPDATE,null, LocalDateTime.now()),HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseEnty<String>> delete(@PathVariable Integer id) {
        Intrest_Detailser.remove(id);
        return new ResponseEntity<>(new ResponseEnty<>(200,Message.SUCCESS_DELETE,null, LocalDateTime.now()),HttpStatus.ACCEPTED);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<ResponseEnty<Intrest_DetailsDto>> get(@PathVariable Integer id) {
        Intrest_DetailsDto dto=Intrest_Detailser.get(id);
        return new ResponseEntity<>(new ResponseEnty<>(200,Message.SUCCESS_FETCH,dto, LocalDateTime.now()),HttpStatus.ACCEPTED);
    }

    @GetMapping("/getAll")
    public ResponseEntity<ResponseEnty<List<Intrest_DetailsDto>>> getall() {
        List<Intrest_DetailsDto> dto=Intrest_Detailser.all();
        return new ResponseEntity<>(new ResponseEnty<>(200,Message.SUCCESS_FETCH,dto, LocalDateTime.now()),HttpStatus.ACCEPTED);
    }

    @GetMapping("/match/{id}")
    public ResponseEntity<ResponseEnty<List<Intrest_DetailsDto>>> findMatch(@PathVariable Integer id) {
        List<Intrest_DetailsDto> dto=Intrest_Detailser.match(id);
        return new ResponseEntity<>(new ResponseEnty<>(200,Message.SUCCESS_FETCH,dto, LocalDateTime.now()),HttpStatus.ACCEPTED);
    }
}

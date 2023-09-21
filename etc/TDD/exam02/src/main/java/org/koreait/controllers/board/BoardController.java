package org.koreait.controllers.board;

import lombok.RequiredArgsConstructor;
import org.koreait.commons.JSONData;
import org.koreait.entities.BoardData;
import org.koreait.models.board.BoardDataInfoService;
import org.koreait.models.board.BoardDataSaveService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/board")
@RequiredArgsConstructor
public class BoardController {
    private final BoardDataSaveService saveService;
    private final BoardDataInfoService infoService;

    @PostMapping
    public ResponseEntity<JSONData<Object>> write(BoardForm form) {
        saveService.save(form);

        HttpStatus status = HttpStatus.CREATED;

        JSONData<Object> data = new JSONData<>();
        data.setSuccess(true);
        data.setStatus(status);

        return ResponseEntity.status(status).body(data);
    }

    @GetMapping("/{id}")
    public ResponseEntity<JSONData<BoardData>> view(@PathVariable Long id) {
        BoardData data = infoService.get(id);

        JSONData<BoardData> jsonData = new JSONData<>();
        jsonData.setSuccess(true);
        jsonData.setData(data);

        return ResponseEntity.status(jsonData.getStatus()).body(jsonData);
    }
}

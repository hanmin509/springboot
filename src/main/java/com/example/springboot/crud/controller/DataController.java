package com.example.springboot.crud.controller;

import com.example.springboot.crud.service.DataService;
import com.example.springboot.crud.vo.DataVO;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@Tag(name = "data", description = "CRUD 테스트 API")
@RestController
public class DataController {

    @Autowired
    DataService dataService;

    @Tag(name = "data")
    @RequestMapping(value = "/insertData", method = RequestMethod.POST)
    public void insertData(@RequestBody String param) {
        dataService.pushData(param);
    }

    @Tag(name = "data")
    @RequestMapping(value = "/selectData", method = RequestMethod.GET)
    public ArrayList data() {
        return dataService.selectDataList();
    }

    @Tag(name = "data")
    @RequestMapping(value = "/deleteData", method = RequestMethod.DELETE)
    public void deleteData() {
        dataService.popData();
    }

    @Tag(name = "data")
    @RequestMapping(value = "/updateData", method = RequestMethod.POST)
    public void updateData(@RequestBody DataVO dataVO) {
        dataService.updateData(dataVO);
    }
}

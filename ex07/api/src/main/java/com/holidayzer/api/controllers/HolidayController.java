package com.holidayzer.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.holidayzer.api.model.HolidayList;

@RestController
@RequestMapping("/holidays")
public class HolidayController {

    HolidayList holidayList = new HolidayList();

    @GetMapping
    public String getHolidays() {
        return holidayList.getHolidays();
    }

    @GetMapping("/{date}")
    public String getHolidayByDate(@PathVariable String date){
        String holidayName = holidayList.getHolidayFromDate(date);
        if (holidayName.equals(""))
            return ("Dia " + date + " não é feriado 🥲");
        else
            return ("Dia " + date + " é " + holidayName +"! 🎉");
    }
}
